package br.com.generation.lista1;

import java.util.Scanner;

public class Galao {
	Scanner leia = new Scanner(System.in);
	
	double galao = 10.0, litros ,x ; {
	litros = galao * 3.7854;
	
	System.out.println("Insira a quantidade de galões: ");
	x = leia.nextDouble();
	
	System.out.println("Isso corresponde à " + litros + " litros");
}
}
