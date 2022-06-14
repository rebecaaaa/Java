package br.com.generation.exer;

public class Testa {

	public static void main(String[] args) {
		Paciente paciente1 = new Paciente();
		
		paciente1.setNome("Rebeca");
		paciente1.setSobrenome("Azevedo");
		paciente1.setIdade(22);
		paciente1.setPeso(68.0);
		paciente1.setAltura(1.74);
	
		
		System.out.println("Dados do paciente");
		System.out.println();
		System.out.println("Nome: " + paciente1.getNome());
		System.out.println("Sobrenome: " + paciente1.getSobrenome());
		System.out.println(paciente1.getIdade() + " anos");
		System.out.println(paciente1.getPeso() + "kgs");
		System.out.println(paciente1.getAltura()+ "cm de altura");
		
	}

}
