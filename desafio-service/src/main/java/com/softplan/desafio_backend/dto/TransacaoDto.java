package com.softplan.desafio_backend.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;

public class TransacaoDto {

	@NotNull(message = "Valor não pode ser nulo")
	@Min(value = 1, message = "Valor deve ser maior que 0")
	private Integer valor;

	@NotNull(message = "Tipo não pode ser nulo")
	@Size(min = 1, max = 1, message = "Tipo deve ser 'r' ou 'd'")
	private String tipo;

	@NotNull(message = "Descrição não pode ser nula")
	private String descricao;

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
