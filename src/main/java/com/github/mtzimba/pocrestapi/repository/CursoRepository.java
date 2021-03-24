package com.github.mtzimba.pocrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.mtzimba.pocrestapi.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
	
	public Curso findByNome(String cursoNome);

}
