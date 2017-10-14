package com.tds171a.soboru.models.medida;

import java.util.List;

import com.tds171a.soboru.vos.Medida;

public class MedidaModel implements IMedidaDAO {
	private MedidaDAO dao;
	
	public MedidaModel() {
		dao = new MedidaDAO();
	}

	@Override
	public boolean incluir(Medida medida) {
		return dao.incluir(medida);
	}

	@Override
	public List<Medida> listar() {
		return dao.listar();
	}

	@Override
	public boolean atualizar(Medida medida) {
		return dao.atualizar(medida);
	}

	@Override
	public boolean remover(int medidaId) {
		return dao.remover(medidaId);
	}
}
