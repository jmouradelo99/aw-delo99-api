package br.com.delo99.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.delo99.api.model.Categoria;
import br.com.delo99.api.repository.CategoriaRepository;

@RestController
@RequestMapping(path="/categorias")
public class CategoriasResource {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public @ResponseBody Iterable<Categoria> listar(){
		return categoriaRepository.findAll();
	}
	
	
}
