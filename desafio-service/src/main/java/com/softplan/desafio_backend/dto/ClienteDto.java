package com.softplan.desafio_backend.dto;

public class ClienteDto {
	private Integer saldo;
	private Integer limite;

	public ClienteDto(Integer saldo, Integer limite) {
		this.saldo = saldo;
		this.limite = limite;
	}

	public Integer getLimite() {
		return limite;
	}

	public void setLimite(Integer limite) {
		this.limite = limite;
	}

	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}
}