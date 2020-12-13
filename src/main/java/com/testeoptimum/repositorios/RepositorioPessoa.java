package com.testeoptimum.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testeoptimum.modelos.Pessoa;

@Repository
public interface RepositorioPessoa extends JpaRepository<Pessoa, Long> {}