package com.srmasset.srmtest.repository;

import org.springframework.data.repository.CrudRepository;

import com.srmasset.srmtest.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
