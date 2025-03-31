package com.softplan.desafio_backend.validator;

import org.springframework.util.StringUtils;

import com.softplan.desafio_backend.dto.TransacaoDto;
import com.softplan.desafio_backend.exception.TransacaoInvalidaException;

public class TransacaoValidator {

	public static void validarTransacao(TransacaoDto transacaoDto) {
		//todo -- try catch aqui

		if (transacaoDto.getTipo() == null || !transacaoDto.getTipo().equals("r") && !transacaoDto.getTipo().equals("d")) {
			throw new TransacaoInvalidaException("Tipo de transação inválido. Use 'r' ou 'd'.");
		}

		if (transacaoDto.getValor() <= 0) {
			throw new TransacaoInvalidaException("O campo valor deve ser maior que zero.");
		}

		if (transacaoDto.getValor() != Math.floor(transacaoDto.getValor())) {
			throw new TransacaoInvalidaException("O campo valor deve ser um número inteiro.");
		}

		if (StringUtils.isEmpty(transacaoDto.getDescricao()) || transacaoDto.getValor() == null) {
			throw new TransacaoInvalidaException("Nenhum campo pode ser nulo ou vazio.");
		}
	}
}

