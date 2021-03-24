package com.github.mtzimba.pocrestapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.mtzimba.pocrestapi.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	public List<Topico> findByCursoNome(String cursoNome);
}
