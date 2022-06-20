package br.com.generation.lacorepeticao;

import java.util.Scanner;

public class While1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idade = 0, pessoas = 0, menos21 =0, mais50 =0;
		
		while(idade !=99) {
			System.out.println("Quantos anos você tem?");
			idade = in.nextInt();
			pessoas++;
			//+;  armazenando a quantidade de idades colocadas
			if(idade <22) {
				menos21++;
			} if(idade >50) {
				mais50++;
			}
		}

		System.out.println("Total de pessoas entrevistadas " + pessoas);
		System.out.println("Total de pessoas com menos de 21 anos: " + menos21);
		System.out.println("Total de pessoas com mais de 50 anos: " + mais50);
		
	}
}
