package com.softplan.desafio_backend.service;

import java.util.List;

import com.softplan.desafio_backend.dto.ClienteDto;
import com.softplan.desafio_backend.dto.TransacaoDto;
import com.softplan.desafio_backend.model.Transacao;

public interface TransacaoService {
	List<Transacao> findTop10ByClienteIdOrderByRealizadaEmDesc(Integer id);
	ClienteDto createTransacao(Integer clienteId, TransacaoDto transacaoDto);
}
