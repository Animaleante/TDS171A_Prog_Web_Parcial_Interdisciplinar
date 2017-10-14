package com.tds171a.soboru.models.ingrediente;

import java.util.List;

import com.tds171a.soboru.vos.Ingrediente;

public class IngredienteModel implements IIngredienteDAO {
	private IngredienteDAO dao;
	
	public IngredienteModel() {
		dao = new IngredienteDAO();
	}

	@Override
	public boolean incluir(Ingrediente ingrediente) {
		return dao.incluir(ingrediente);
	}

	@Override
	public List<Ingrediente> listar() {
		return dao.listar();
	}

	@Override
	public boolean atualizar(Ingrediente ingrediente) {
		return dao.atualizar(ingrediente);
	}

	@Override
	public boolean remover(int ingredienteId) {
		return dao.remover(ingredienteId);
	}
}
