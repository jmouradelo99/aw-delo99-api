package br.com.delo99.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.delo99.api.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
