package br.com.generation.lacorepeticao;

import java.util.Scanner;

public class DoWhile1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n=0, i =0, soma =0;

			do {
				System.out.println("Digite um numero");
				i = in.nextInt();
				n++;
				soma+=n;
			}while(i !=0);
			
			
			System.out.println(soma);
	
	}
}