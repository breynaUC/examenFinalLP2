package pe.edu.ucs.examenFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ucs.examenFinal.entity.Categoria;
import pe.edu.ucs.examenFinal.repository.CategoriaRepository;

@Service
public class CategoriaService implements ICategoria{

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Override
	public Categoria create(Categoria cat) {
		// TODO Auto-generated method stub
		return categoriaRepository.save(cat);
	}

	@Override
	public Categoria update(Categoria cat) {
		// TODO Auto-generated method stub
		return categoriaRepository.save(cat);
	}

	@Override
	public Optional<Categoria> read(Long id) {
		// TODO Auto-generated method stub
		return categoriaRepository.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		categoriaRepository.deleteById(id);
	}

	@Override
	public List<Categoria> readAll() {
		// TODO Auto-generated method stub
		return categoriaRepository.findAll();
	}

}
