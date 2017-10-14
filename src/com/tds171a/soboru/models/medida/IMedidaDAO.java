package com.tds171a.soboru.models.medida;

import java.util.List;

import com.tds171a.soboru.vos.Medida;

public interface IMedidaDAO {
	public boolean incluir(Medida medida);
	public List<Medida> listar();
	public boolean atualizar(Medida medida);
	public boolean remover(int medidaId);
}
