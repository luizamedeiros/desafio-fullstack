package com.softplan.desafio_backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class SaldoInsuficienteException extends RuntimeException {
	public SaldoInsuficienteException() {
		super("Os fundos do cliente são insuficientes para a transação.");
	}
}
