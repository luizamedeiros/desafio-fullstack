package com.softplan.desafio_backend.service;

import java.util.List;

import com.softplan.desafio_backend.model.Cliente;

public interface ClienteService {
	List<Cliente> getClientes();
	Cliente getClienteById(Integer id);
}
