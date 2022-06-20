package br.com.generation.lacorepeticao;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, par =0, impar = 0;
		
		for(int i=0; i <=10; i++) {
			System.out.println("Digite um número");
			n = in.nextInt();
			
			if(n % 2 == 0) {
				par++;
			}else impar ++;
		} 
		
			
		System.out.println("Foram digitados " + par +" numeros pares" );
		System.out.println("E " + impar + " numeros ímpares");
	}

}
