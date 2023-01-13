package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Exemplo_1 {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();

		nomes.add("Maria");
		nomes.add("Ricardo");
		nomes.add("Pedro");

		// Iterando uma lista 1

		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}

		// Iterando uma lista 2

		for (String nome : nomes) {
			System.out.println(nome);
		}

		// Iterando uma lista 3

		nomes.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		// Iterando uma lista 3 (simplificado)
		
		nomes.forEach(nome -> System.out.println(nome));
		
		// Iterando uma lista 3 (+simplificado)
		
		nomes.forEach(System.out::println);

	}

}
