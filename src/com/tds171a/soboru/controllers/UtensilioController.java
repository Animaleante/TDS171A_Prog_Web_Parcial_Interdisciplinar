package com.tds171a.soboru.controllers;

import java.util.List;

import com.tds171a.soboru.models.utensilio.UtensilioModel;
import com.tds171a.soboru.vos.Utensilio;

public class UtensilioController {
	private UtensilioModel model;
	
	public UtensilioController() {
		model = new UtensilioModel();
	}

	public boolean incluir(Utensilio utensilio) {
		return model.incluir(utensilio);
	}

	public List<Utensilio> listar() {
		return model.listar();
	}
	
	public boolean atualizar(Utensilio utensilio) {
		return model.atualizar(utensilio);
	}

	public boolean remover(int utensilioId) {
		return model.remover(utensilioId);
	}
}
