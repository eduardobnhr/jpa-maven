package application;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Carlos Da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(2, "Alexandre Da Silva", "alexandre@gmail.com");
		Pessoa p3 = new Pessoa(3, "Isaias Da Silva", "isaias@gmail.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
