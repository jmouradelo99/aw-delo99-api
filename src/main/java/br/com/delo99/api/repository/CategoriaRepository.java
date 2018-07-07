package br.com.delo99.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.delo99.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
