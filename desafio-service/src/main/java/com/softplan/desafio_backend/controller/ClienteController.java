package com.softplan.desafio_backend.controller;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softplan.desafio_backend.dto.ClienteDto;
import com.softplan.desafio_backend.dto.ExtratoDto;
import com.softplan.desafio_backend.dto.TransacaoDto;
import com.softplan.desafio_backend.exception.ClienteNaoEncontradoException;
import com.softplan.desafio_backend.model.Cliente;
import com.softplan.desafio_backend.model.Transacao;
import com.softplan.desafio_backend.service.ClienteService;
import com.softplan.desafio_backend.service.ClienteServiceImpl;
import com.softplan.desafio_backend.service.TransacaoService;
import com.softplan.desafio_backend.service.TransacaoServiceImpl;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired ClienteServiceImpl clienteService;
	@Autowired TransacaoServiceImpl transacaoService;

	@GetMapping
	public ResponseEntity<List<Cliente>> getClientes(){
		return ResponseEntity.ok(clienteService.getClientes());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Cliente> getClienteById(@PathVariable Integer id){
		Cliente cliente = clienteService.getClienteById(id);
		if(cliente == null){
			throw new ClienteNaoEncontradoException(id);
		}
		return ResponseEntity.ok(cliente);
	}

	@PostMapping("/{id}/transacoes")
	public ResponseEntity<ClienteDto> createTransacao(
			@PathVariable Integer id,
			@Valid @RequestBody TransacaoDto transacaoDto){
		return ResponseEntity.ok(transacaoService.createTransacao(id, transacaoDto));
	}

	@GetMapping("/{id}/extrato")
	public ResponseEntity<ExtratoDto> getExtrato(@PathVariable Integer id){
		Cliente cliente = clienteService.getClienteById(id);
		List<Transacao> transacoes = transacaoService.findTop10ByClienteIdOrderByRealizadaEmDesc(id);

		ExtratoDto extratoDto = new ExtratoDto();
		extratoDto.setLimite(cliente.getLimite());
		extratoDto.setTotal(cliente.getSaldo());
		extratoDto.setLocalDateTime(LocalDateTime.now());
		extratoDto.setTransacoes(transacoes);

		return ResponseEntity.ok(extratoDto);
	}

}
