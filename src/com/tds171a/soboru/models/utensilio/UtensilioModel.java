package com.tds171a.soboru.models.utensilio;

import java.util.List;

import com.tds171a.soboru.vos.Utensilio;

public class UtensilioModel implements IUtensilioDAO {
	private UtensilioDAO dao;
	
	public UtensilioModel() {
		dao = new UtensilioDAO();
	}

	@Override
	public boolean incluir(Utensilio utensilio) {
		return dao.incluir(utensilio);
	}

	@Override
	public List<Utensilio> listar() {
		return dao.listar();
	}

	@Override
	public boolean atualizar(Utensilio utensilio) {
		return dao.atualizar(utensilio);
	}

	@Override
	public boolean remover(int utensilioId) {
		return dao.remover(utensilioId);
	}
}
