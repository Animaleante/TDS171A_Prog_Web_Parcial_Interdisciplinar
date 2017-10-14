package com.tds171a.soboru.models.utensilio;

import java.util.List;

import com.tds171a.soboru.vos.Utensilio;

public interface IUtensilioDAO {
	public boolean incluir(Utensilio utensilio);
	public List<Utensilio> listar();
	public boolean atualizar(Utensilio utensilio);
	public boolean remover(int utensilioId);
}
