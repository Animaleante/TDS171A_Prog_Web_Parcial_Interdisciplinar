package com.tds171a.soboru.models.ingrediente;

import java.util.List;

import com.tds171a.soboru.vos.Ingrediente;

public interface IIngredienteDAO {
	public boolean incluir(Ingrediente ingrediente);
	public List<Ingrediente> listar();
	public boolean atualizar(Ingrediente ingrediente);
	public boolean remover(int ingredienteId);
}
