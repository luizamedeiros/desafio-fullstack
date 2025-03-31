package com.softplan.desafio_backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class TransacaoInvalidaException extends RuntimeException {
	public TransacaoInvalidaException() {
		super("Os valores enviados não correspondem aos tipos esperados. Por favor os verifique e tente novamente.");
	}

	public TransacaoInvalidaException(String message) {
		super(message);
	}
}

