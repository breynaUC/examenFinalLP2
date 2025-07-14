package pe.edu.ucs.examenFinal.service;

import java.util.List;
import java.util.Optional;

import pe.edu.ucs.examenFinal.entity.Categoria;

public interface ICategoria {

	Categoria create(Categoria cat);
	Categoria update(Categoria cat);
	Optional<Categoria> read(Long id);
	void delete(Long id);
	List<Categoria> readAll();
}
