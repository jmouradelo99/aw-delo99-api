package br.com.delo99.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.delo99.api.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
