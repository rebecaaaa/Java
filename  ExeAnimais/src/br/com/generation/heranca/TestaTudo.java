package br.com.generation.heranca;

import java.util.Scanner; 

public class TestaTudo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Cachorro dog1 = new Cachorro();
		
		System.out.println("Digite o nome do dog: ");
		dog1.setNome(entrada.next());
		System.out.println("Digite a idade do dog: ");
		dog1.setIdade(entrada.nextInt());
		dog1.setSom("Latido.");
		dog1.setCorre("É capaz de correr.");
		
		
		Cavalo cavalo1 = new Cavalo();
		
		
		System.out.println("Digite o nome do Equino: ");
		cavalo1.setNome(entrada.next());
		System.out.println("Digite a idade do Equino: ");
		cavalo1.setIdade(entrada.nextInt());
		cavalo1.setSom("Relincho");
		cavalo1.setCorre("É capaz de correr.");
		
		Preguica pregy1 = new Preguica();
		
		System.out.println("Digite o nome do Bicho Preguiça: ");
		pregy1.setNome(entrada.next());
		System.out.println("Digite a idade do Bicho Preguiça: ");
		pregy1.setIdade(entrada.nextInt());
		pregy1.setSom("AAAAAAAH");
		pregy1.setArvore("É capaz de subir em árvores.");
		
		
		System.out.println(dog1.getNome());
		System.out.println(dog1.getIdade());
		System.out.println(dog1.getSom());
		System.out.println(dog1.getCorre());
		System.out.println();
		
		System.out.println(cavalo1.getNome());
		System.out.println(cavalo1.getIdade());
		System.out.println(cavalo1.getSom());
		System.out.println(cavalo1.getCorre());
		System.out.println();
		
		System.out.println(pregy1.getNome());
		System.out.println(pregy1.getIdade());
		System.out.println(pregy1.getSom());
		System.out.println(pregy1.getArvore());
	}

}
