package com.tds171a.soboru.vos;

public class Ingrediente {
	private int id;
	private String nome;
	
	public Ingrediente() {}
	
	public Ingrediente(String nome) {
		this.nome = nome;
	}
	
	public Ingrediente(int id, String nome) {
		this.id = id;
		this.nome = nome;
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
}
