package com.mybank.servicebank.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybank.servicebank.entities.Pessoa;
import com.mybank.servicebank.repositories.PessoaRepository;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {

	@Autowired
	private PessoaRepository repository;
	
	@GetMapping
	public List<Pessoa> getAllPessoas(){
		return repository.findAll();
	}
	
	@GetMapping(value = "/id")
	public Pessoa getPessoaById(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping
	public Pessoa insertPessoa(@RequestBody Pessoa pessoa) {
		return repository.save(pessoa);
	}
	
	@PutMapping
	public Pessoa editPessoa(@RequestBody Pessoa pessoa, @PathVariable Long id) {
		var pessoaData = repository.findById(id).get();
		
		pessoaData.setNome(pessoa.getNome());
		pessoaData.setIdade(pessoa.getIdade());
		pessoaData.setFila(pessoa.getFila());
		
		return repository.save(pessoaData);
	}
	
	public Pessoa deletePessoa(@PathVariable Long id) {
		var pessoaData = repository.findById(id).get();
		
		repository.delete(pessoaData);
		
		return pessoaData;		
	}
}
