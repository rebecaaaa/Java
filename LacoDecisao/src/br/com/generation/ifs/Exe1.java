package br.com.generation.ifs;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		//Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
		//categoria ela se encontra:
				
				int idade;
				Scanner in = new Scanner(System.in);
				
				System.out.println("Insira a sua idade: ");
				idade =in.nextInt();
				
				if(idade >=10 && idade <14) {
				System.out.println("Voce est� na categoria infantil");
				
				}else if(idade >=15 && idade <17) {
				System.out.println("Voce est� na categoria juvenil");
			
		      } else if
		    	  (idade >=18 && idade <25) {
		    	 System.out.println("Voce est� na categoria adulto");
		      }
	
	}
}
