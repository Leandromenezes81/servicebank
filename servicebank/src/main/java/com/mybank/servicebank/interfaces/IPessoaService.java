package com.mybank.servicebank.interfaces;

import java.util.List;

import com.mybank.servicebank.entities.Pessoa;

public interface IPessoaService {

	List<Pessoa> getAllPessoas();

	Pessoa getPessoaById(Long id);

	Pessoa insertPessoa(Pessoa pessoa);

	Pessoa editPessoa(Pessoa pessoa, Long id);

	Pessoa deletePessoa(Long id);
}
