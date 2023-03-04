package com.mybank.servicebank.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "organizacaoFila")
public class Posicao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int pessoa_id;
	private int pessoa_posicao;

	public Posicao() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPessoa_id() {
		return pessoa_id;
	}

	public void setPessoa_id(int pessoa_id) {
		this.pessoa_id = pessoa_id;
	}

	public int getPessoa_posicao() {
		return pessoa_posicao;
	}

	public void setPessoa_posicao(int pessoa_posicao) {
		this.pessoa_posicao = pessoa_posicao;
	}

																																																											}
