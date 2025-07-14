package pe.edu.ucs.examenFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.ucs.examenFinal.entity.Categoria;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
