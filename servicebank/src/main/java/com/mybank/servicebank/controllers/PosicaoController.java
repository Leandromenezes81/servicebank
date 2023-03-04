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

import com.mybank.servicebank.entities.Posicao;
import com.mybank.servicebank.repositories.PosicaoRepository;

@RestController
@RequestMapping(value = "/posicoes")
public class PosicaoController {

	@Autowired
	private PosicaoRepository repository;

	@GetMapping
	public List<Posicao> getAllPosicoes() {
		return repository.findAll();
	}

	@GetMapping(value = "/id")
	public Posicao getPosicaoById(@PathVariable Long id) {
		return repository.findById(id).get();
	}

	@PostMapping
	public Posicao insertPosicao(@RequestBody Posicao posicao) {
		return repository.save(posicao);
	}

	@PutMapping
	public Posicao editPosicao(@RequestBody Posicao posicao, @PathVariable Long id) {
		var posicaoData = repository.findById(id).get();

		posicaoData.setPessoa_id(posicao.getPessoa_id());
		posicaoData.setPessoa_posicao(posicao.getPessoa_posicao());

		return repository.save(posicaoData);
	}

	public Posicao deletePessoa(@PathVariable Long id) {
		var posicaoData = repository.findById(id).get();

		repository.delete(posicaoData);

		return posicaoData;
	}
}
