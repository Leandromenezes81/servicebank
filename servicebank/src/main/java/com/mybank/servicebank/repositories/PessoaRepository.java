package com.mybank.servicebank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mybank.servicebank.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
