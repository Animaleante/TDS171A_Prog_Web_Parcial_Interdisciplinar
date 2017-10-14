package com.tds171a.soboru.controllers;

import java.util.List;

import com.tds171a.soboru.models.medida.MedidaModel;
import com.tds171a.soboru.vos.Medida;

public class MedidaController {
	private MedidaModel model;
	
	public MedidaController() {
		model = new MedidaModel();
	}

	public boolean incluir(Medida medida) {
		return model.incluir(medida);
	}

	public List<Medida> listar() {
		return model.listar();
	}
	
	public boolean atualizar(Medida medida) {
		return model.atualizar(medida);
	}

	public boolean remover(int medidaId) {
		return model.remover(medidaId);
	}
}
