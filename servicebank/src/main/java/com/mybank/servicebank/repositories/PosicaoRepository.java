package com.mybank.servicebank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mybank.servicebank.entities.Posicao;

public interface PosicaoRepository extends JpaRepository<Posicao, Long> {

}
