package com.softplan.desafio_backend.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.softplan.desafio_backend.model.Transacao;

public class ExtratoDto {
	private Integer limite;
	private Integer total;
	private LocalDateTime localDateTime;
	private List<Transacao> transacoes;

	public Integer getLimite() {
		return limite;
	}

	public void setLimite(Integer limite) {
		this.limite = limite;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public List<Transacao> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(List<Transacao> transacoes) {
		this.transacoes = transacoes;
	}
}
