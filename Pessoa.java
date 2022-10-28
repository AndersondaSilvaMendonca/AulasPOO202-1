package Pessoa;

public class Pessoa {
	private String nome;
	private int idade;
	private float salarioMensal = 1.200f;
	private float salarioAnual;

	public Pessoa(String nome, int idade, float salarioMensal, float salarioAnual) {
		this.nome = nome;
		this.idade = idade;
		this.salarioMensal = salarioMensal;
		this.salarioAnual = salarioAnual;

	}

	public float getsalarioMensal() {
		return this.salarioMensal;
	}

	private void setsalarioMensal(float salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	public float getsalarioAnual() {
		return this.salarioAnual;
	}

	private float setsalarioAnual(float salarioAnual) {
		return this.salarioAnual = salarioAnual;
	}

	public void apresentarPessoa() {
		System.out.println("Nome: " + this.nome + ", Idade: " + this.idade + " anos, recebe mensalmente R$ "
				+ this.getsalarioMensal() + " reais e anualmente R$ " + this.getsalarioAnual() + " reais.");
	}

}
