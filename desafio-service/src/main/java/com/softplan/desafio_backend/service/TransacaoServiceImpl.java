package com.softplan.desafio_backend.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softplan.desafio_backend.dto.ClienteDto;
import com.softplan.desafio_backend.dto.TransacaoDto;
import com.softplan.desafio_backend.exception.ClienteNaoEncontradoException;
import com.softplan.desafio_backend.exception.SaldoInsuficienteException;
import com.softplan.desafio_backend.model.Cliente;
import com.softplan.desafio_backend.model.Transacao;
import com.softplan.desafio_backend.repository.ClienteRepository;
import com.softplan.desafio_backend.repository.TransacaoRepository;
import com.softplan.desafio_backend.validator.TransacaoValidator;

@Service
public class TransacaoServiceImpl implements TransacaoService{

	@Autowired TransacaoRepository transacaoRepository;
	@Autowired ClienteRepository clienteRepository;

	@Override
	public List<Transacao> findTop10ByClienteIdOrderByRealizadaEmDesc(Integer clienteId) {
		return transacaoRepository.findTop10ByClienteIdOrderByRealizadaEmDesc(clienteId);
	}

	@Override
	public ClienteDto createTransacao(Integer clienteId, TransacaoDto transacaoDto) {
		Cliente cliente = clienteRepository.findById(clienteId).orElseThrow(() ->
				new ClienteNaoEncontradoException(clienteId)
		);

		TransacaoValidator.validarTransacao(transacaoDto);

		//todo revisar logica
		if (transacaoDto.getTipo().equals("d") && cliente.getLimite() < cliente.getSaldo() - transacaoDto.getValor()) {
			throw new SaldoInsuficienteException();
		}

		Transacao transacao = new Transacao();
		transacao.setClienteId(clienteId);
		transacao.setValor(transacaoDto.getValor());
		transacao.setTipo(transacaoDto.getTipo());
		transacao.setDescricao(transacaoDto.getDescricao());
		transacao.setRealizadaEm(LocalDateTime.now());
		transacaoRepository.save(transacao);

		if (transacaoDto.getTipo().equals("r")) {
			cliente.setSaldo(cliente.getSaldo() + transacaoDto.getValor());
		} else {
			cliente.setSaldo(cliente.getSaldo() - transacaoDto.getValor());
		}

		clienteRepository.save(cliente);

		return new ClienteDto(cliente.getSaldo(), cliente.getLimite());
	}
}

