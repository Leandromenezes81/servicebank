package com.mybank.servicebank.interfaces;

import java.util.List;

import com.mybank.servicebank.entities.Posicao;

public interface IPosicaoService {

	List<Posicao> getAllPessoas();

	Posicao getPessoaById(Long id);

	Posicao insertPessoa(Posicao posicao);

	Posicao editPessoa(Posicao posicao, Long id);

	Posicao deletePessoa(Long id);
}
