package com.softplan.desafio_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softplan.desafio_backend.model.Transacao;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Integer> {
	List<Transacao> findTop10ByClienteIdOrderByRealizadaEmDesc(Integer clienteId);

}
