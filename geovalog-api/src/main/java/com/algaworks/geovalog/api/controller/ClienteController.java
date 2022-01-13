package com.algaworks.geovalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.geovalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João2");
		cliente1.setTelefone("9999999");
		cliente1.setEmail("joao@hotmail.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("888888888888");
		cliente2.setEmail("maria@hotmail.com");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
