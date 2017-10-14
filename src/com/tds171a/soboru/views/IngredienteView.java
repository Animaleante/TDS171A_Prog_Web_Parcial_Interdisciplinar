package com.tds171a.soboru.views;

import java.util.List;

import com.tds171a.soboru.controllers.IngredienteController;
import com.tds171a.soboru.utils.Leitor;
import com.tds171a.soboru.vos.Ingrediente;

public class IngredienteView {
	private IngredienteController controller;
	
	public IngredienteView() {
		controller = new IngredienteController();
		
		while (menu() != 9) {
		}
	}

	private int menu() {
		System.out.println(" --- Menu ---");

		System.out.println("1 - Incluir Ingrediente");
		System.out.println("2 - Listar Ingredientes");
		System.out.println("3 - Atualizar Ingrediente");
		System.out.println("4 - Deletar Ingrediente");
		System.out.println("9 - Sair");

		int op = -1;
		op = Leitor.readInt();

		switch (op) {
			case 1:
				incluir();
				break;
			case 2:
				listar();
				break;
			case 3:
				atualizar();
				break;
			case 4:
				remover();
				break;
			case 9:
				break;
			default:
				System.out.println("Opcao escolhida invalida!\n");
				break;
		}

		return op;
	}

	private void incluir() {
		String nome = "";
		
		nome = Leitor.readString("Digite o nome do ingrediente: ");
		
		Ingrediente ingrediente = new Ingrediente(nome);
		
		System.out.println("Incluindo...");
		if(controller.incluir(ingrediente))
			System.out.println("Ingrediente incluido com sucesso!");
		else 
			System.out.println("Não foi possivel inserir esse ingrediente.");
	}

	private void listar() {
		List<Ingrediente> list = controller.listar();
		
		if(list == null) {
			System.out.println("Houve um erro ao tentar listar os ingredientes.");
		} else if(list.isEmpty()) {
			System.out.println("A lista de ingredientes esta vazia.");
		} else {
			System.out.println("Lista de ingredientes:");
			
			for (int i = 0; i < list.size(); i++) {
				System.out.println("Ingrediente: " + list.get(i).getNome());
			}
			
			System.out.println("");
		}
	}

	private void atualizar() {
		// TODO Auto-generated method stub
		
	}

	private void remover() {
		// TODO Auto-generated method stub
		
	}
}
