package com.tds171a.soboru.controllers;

import java.util.List;

import com.tds171a.soboru.models.ingrediente.IngredienteModel;
import com.tds171a.soboru.vos.Ingrediente;

public class IngredienteController {
	private IngredienteModel model;
	
	public IngredienteController() {
		model = new IngredienteModel();
	}

	public boolean incluir(Ingrediente ingrediente) {
		return model.incluir(ingrediente);
	}

	public List<Ingrediente> listar() {
		return model.listar();
	}
	
	public boolean atualizar(Ingrediente ingrediente) {
		return model.atualizar(ingrediente);
	}

	public boolean remover(int ingredienteId) {
		return model.remover(ingredienteId);
	}
}
