package com.srmasset.srmtest.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.srmasset.srmtest.dto.ClienteDto;
import com.srmasset.srmtest.model.Cliente;
import com.srmasset.srmtest.service.ClienteService;

@RestController 
@CrossOrigin(origins = "*")
@RequestMapping(path="/cliente")
public class ClienteController {
	
	@Autowired
	public ClienteService clienteService;
	
	
	@RequestMapping(method = RequestMethod.POST)
	public Long add(@RequestBody ClienteDto clienteDto) {
		
		return clienteService.add(clienteDto);
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Cliente> getAllUsers() {
		
		return clienteService.listAll();
}

}
