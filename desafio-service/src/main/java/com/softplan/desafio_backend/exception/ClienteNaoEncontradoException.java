package com.softplan.desafio_backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ClienteNaoEncontradoException extends RuntimeException {
	public ClienteNaoEncontradoException(Integer id) {
		super("Não foi encontrado cliente com o ID " + id);
	}
}
