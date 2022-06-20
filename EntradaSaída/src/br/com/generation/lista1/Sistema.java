package br.com.generation.lista1;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
			
		Scanner in = new Scanner(System.in);
		
		int a, b, c;
		int d = 0;
		int r = 0;
		int s = 0;
		
		System.out.println("Insira o valor de A: ");
		a = in.nextInt();
		System.out.println("Insira o valor de B: ");
		b = in.nextInt();
		System.out.println("Insira o valor de C: ");
		c = in.nextInt();
		
		r = (a+b) * (a+b);
		s = (b+c) * (b+c);
		
		d = (r + s)/ 2;
		
		System.out.println("D = " + d + ", o valor de r + s / 2");
	}

}
