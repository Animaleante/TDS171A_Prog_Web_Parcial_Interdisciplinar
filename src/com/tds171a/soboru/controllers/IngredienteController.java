package com.tds171a.soboru.controllers;

import java.util.List;

import com.tds171a.soboru.models.ingrediente.IngredienteModel;
import com.tds171a.soboru.vos.Ingrediente;

/**
 * Classe de controller do Ingrediente
 * @author Diogo
 *
 */
public class IngredienteController {
	
	/**
	 * Par�metro de model do Ingrediente
	 */
	private IngredienteModel model;
	
	/**
	 * Construtor da classe de controller do Ingrediente
	 */
	public IngredienteController() {
		model = new IngredienteModel();
	}

	/**
	 * M�todo para incluir um novo Ingrediente
	 * @param ingrediente
	 * @return
	 */
	public boolean incluir(Ingrediente ingrediente) {
		return model.incluir(ingrediente);
	}

	/**
	 * M�todo para trazer uma lista de todos os Ingredientes
	 * @return
	 */
	public List<Ingrediente> listar() {
		return model.listar();
	}
	
	/**
	 * M�todo para atualizar um Ingrediente j� registrado
	 * @param ingrediente
	 * @return
	 */
	public boolean atualizar(Ingrediente ingrediente) {
		return model.atualizar(ingrediente);
	}

	/**
	 * M�todo para remover um Ingrediente
	 * @param ingredienteId
	 * @return
	 */
	public boolean remover(int ingredienteId) {
		return model.remover(ingredienteId);
	}
}
