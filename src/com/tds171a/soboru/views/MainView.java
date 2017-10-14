package com.tds171a.soboru.views;

import com.tds171a.soboru.utils.Leitor;

public class MainView {
	public MainView() {
		while (menu() != 9) {
		}
	}

	private int menu() {
		System.out.println(" --- Menu ---");

		System.out.println("1 - Ingredientes");
		System.out.println("2 - Utensilios");
		System.out.println("3 - Receita");
		System.out.println("9 - Sair");

		int op = -1;
		op = Leitor.readInt();

		switch (op) {
			case 1:
				new IngredienteView();
				break;
			case 2:

				break;
			case 9:
				System.out.println("Até mais!");
				break;
			default:
				System.out.println("Opcao escolhida invalida!\n");
				break;
		}

		return op;
	}
}
