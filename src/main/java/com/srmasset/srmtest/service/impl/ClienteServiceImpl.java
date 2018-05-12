package com.srmasset.srmtest.service.impl;



import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srmasset.srmtest.dto.ClienteDto;
import com.srmasset.srmtest.exception.SrmValidationException;
import com.srmasset.srmtest.model.Cliente;
import com.srmasset.srmtest.repository.ClienteRepository;
import com.srmasset.srmtest.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public Long add(ClienteDto clienteDto) {

		Cliente cliente = new Cliente();
		
		try {
			cliente.setNomeCliente(clienteDto.getNomeCliente());
			cliente.setRisco(clienteDto.getRisco().toUpperCase().trim());
			cliente.setLimiteDeCredito(clienteDto.getLimiteDeCredito());
			cliente.setTaxaDeJuros(calculateTax(clienteDto.getRisco().toUpperCase().trim()));
			
			cliente = clienteRepository.save(cliente);
			
		} catch (SrmValidationException validateException) {
			logger.error("Erro na validação dos dados do cliente.", validateException.fillInStackTrace());
			throw new RuntimeException();
		} catch (NullPointerException nullException) {
			logger.error("Erro em campos nulos.", nullException.fillInStackTrace());
			throw new RuntimeException();
		}
		
		return cliente.getId();
	}

	@Override
	public Iterable<Cliente> listAll() {
		return clienteRepository.findAll();
	}
	
	
	private double calculateTax(String risk) {
		Map<String, Double> tax = new HashMap<String, Double>();
		tax.put("A", 0d);
		tax.put("B", 10.0);
		tax.put("C", 20.0);
		return(tax.get(risk));
	}
	

}
