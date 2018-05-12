package com.srmasset.srmtest.service;



import com.srmasset.srmtest.dto.ClienteDto;
import com.srmasset.srmtest.model.Cliente;

public interface ClienteService {
	
	public Long add(ClienteDto clienteDto);
	
	public Iterable<Cliente> listAll();

}
