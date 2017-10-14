package com.tds171a.soboru.vos;

public class Medida {
	private int id;
	private String nome;
	private String abreveacao;
	
	public Medida() {}
	
	public Medida(String nome, String abreveacao) {
		this.nome = nome;
		this.abreveacao = abreveacao;
	}
	
	public Medida(int id, String nome, String abreveacao) {
		this.id = id;
		this.nome = nome;
		this.abreveacao = abreveacao;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the abreveacao
	 */
	public String getAbreveacao() {
		return abreveacao;
	}

	/**
	 * @param abreveacao the abreveacao to set
	 */
	public void setAbreveacao(String abreveacao) {
		this.abreveacao = abreveacao;
	}
}
