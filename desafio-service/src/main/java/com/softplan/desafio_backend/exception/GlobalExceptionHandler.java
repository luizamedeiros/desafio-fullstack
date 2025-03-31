package com.softplan.desafio_backend.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ClienteNaoEncontradoException.class)
	public ResponseEntity<Map<String, String>> handleClienteNotFound(ClienteNaoEncontradoException ex){
		Map<String, String> response = new HashMap<>();
		response.put("Erro: ", ex.getMessage());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}

	@ExceptionHandler(SaldoInsuficienteException.class)
	public ResponseEntity<Map<String, String>> handleSaldoInsuficiente(SaldoInsuficienteException ex){
		Map<String, String> response = new HashMap<>();
		response.put("Erro: ", ex.getMessage());

		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(response);
	}

	@ExceptionHandler(TransacaoInvalidaException.class)
	public ResponseEntity<Map<String, String>> handleTransacaoInvalida(TransacaoInvalidaException ex){
		Map<String, String> response = new HashMap<>();
		response.put("Erro: ", ex.getMessage());

		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(response);
	}


}
