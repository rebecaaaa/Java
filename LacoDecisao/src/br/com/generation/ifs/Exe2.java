package br.com.generation.ifs;

import java.util.Scanner; 

public class Exe2 {

	public static void main(String[] args) {
		
		int numero, quadrado;
		double raizq;
			
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		numero = in.nextInt();
		
		
		quadrado = (numero*numero);
		raizq = Math.sqrt(numero);
		
		
		if(numero % 2 == 0) {
			System.out.println("Este é um numero par cuja raiz quadrada é " + raizq );
	} else {
		System.out.println("Este é um numero ímpar e seu quadrado é " + quadrado);
	}
		
   }
}


