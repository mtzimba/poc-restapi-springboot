package com.github.mtzimba.pocrestapi.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.github.mtzimba.pocrestapi.model.Curso;

@DataJpaTest
public class CursoRepositoryTest {

	@Autowired
	private CursoRepository repository;
	
	@Test
	void deveriaTerUmCurso() {
		String nomeCurso = "HTML 5";
		Curso curso = repository.findByNome(nomeCurso);
		assertNotNull(curso);
		assertEquals(nomeCurso, curso.getNome());
	}

	@Test
	void naoDeveriaTerUmCurso() {
		String nomeCurso = "JPA";
		Curso curso = repository.findByNome(nomeCurso);
		assertNull(curso);
	}
}
