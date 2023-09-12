package br.com.exemplo.portfolio.dto;

import br.com.exemplo.portfolio.model.Contato;

public class ContatoDto {
	
	private Integer id;
	private String nome;
	private String numero;
	private String tipo;
	
	public ContatoDto(Integer id, String nome, String numero, String tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.numero = numero;
		this.tipo = tipo;
	}
	public ContatoDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContatoDto(Contato contato) {
		super();
		this.id = contato.getId();
		this.nome = contato.getNome();
		this.numero = contato.getNumero();
		this.tipo = contato.getTipo();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
