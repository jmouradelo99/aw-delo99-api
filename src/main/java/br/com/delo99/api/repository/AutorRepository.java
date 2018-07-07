package br.com.delo99.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.delo99.api.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Integer> {

}
