package com.srmasset.srmtest.dto;

import java.io.Serializable;

public class ClienteDto implements Serializable {

	private static final long serialVersionUID = 8786173007450499819L;
	
	private Long id;
	
	private String nomeCliente;
	
	private Double limiteDeCredito;
	
	private String risco;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getLimiteDeCredito() {
		return limiteDeCredito;
	}

	public void setLimiteDeCredito(Double limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
	}

	public String getRisco() {
		return risco;
	}

	public void setRisco(String risco) {
		this.risco = risco;
	}
	

}
