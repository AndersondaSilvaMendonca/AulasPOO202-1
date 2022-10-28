package Pessoa;

public class Principal {

	public static void main(String[] args) {
		float salarioMensal = 1.212f;
		float salarioAnual = 14.544f;

		System.out.println("Hello World"); // printa Hello World

		Pessoa p = new Pessoa("Jonathan Ramos", 18, salarioMensal, salarioAnual);
		p.apresentarPessoa();

	}

}
