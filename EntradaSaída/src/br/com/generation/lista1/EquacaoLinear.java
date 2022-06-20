package br.com.generation.lista1;

import java.util.Scanner;

public class EquacaoLinear {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a, b, c, d, e, f;
		int x=0;
		int y =0;
		
		System.out.println("Insira o valor de a: ");
		a = in.nextInt();
		
		System.out.println("Insira o valor de b: ");
		b = in.nextInt();
		
		System.out.println("Insira o valor de c: ");
		c = in.nextInt();
		
		System.out.println("Insira o valor de d: ");
		d = in.nextInt();
		
		System.out.println("Insira o valor de e: ");
		e = in.nextInt();
		
		System.out.println("Insira o valor de f: ");
		f = in.nextInt();
		
		x = (c*e) - (b*f) / (a*e) - (b*d);
		y = (a*f) - (c*d) / (a*e) - (b*d);
		
		System.out.println("O valor de X é: " + x );
		System.out.println("O valor de Y é: " + y);
	}

}
