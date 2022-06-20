package br.com.generation.exer;

import java.util.Scanner;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.setNome("Kendall Roy");
		funcionario1.setCargo("Filho do dono");
		funcionario1.setSalario(50.000);
		funcionario1.setIdade(37);
		
		Funcionario funcionario2 = new Funcionario();
		funcionario1.setNome("Gerri kellman");
		funcionario1.setCargo("CEO");
		funcionario1.setSalario(50.000);
		funcionario1.setIdade(63);
		
		Scanner in = new Scanner(System.in);
		
		Funcionario funcionario3 = new Funcionario();
		
		System.out.println("Digite o nome do funcionario");
		funcionario3.setNome(in.next());
		System.out.println("Digite o cargo do funcionario");
		funcionario3.setCargo(in.next());
		System.out.println("Digite o salário do funcionário");
		funcionario3.setSalario(in.nextDouble());
		System.out.println("Digite a idade do funcionário");
		funcionario3.setIdade(in.nextInt());
		
	}
}
