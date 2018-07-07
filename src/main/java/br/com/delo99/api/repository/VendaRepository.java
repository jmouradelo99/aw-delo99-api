package br.com.delo99.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.delo99.api.model.Venda;

public interface VendaRepository extends JpaRepository<Venda, Integer> {

}
