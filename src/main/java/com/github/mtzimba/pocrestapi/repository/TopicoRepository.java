package com.github.mtzimba.pocrestapi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.github.mtzimba.pocrestapi.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	public Page<Topico> findByCursoNome(String cursoNome, Pageable paginacao);
}
