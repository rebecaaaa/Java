package br.com.generation.lista1;
import java.util.Scanner;

public class MediaNota {

	public static void main(String[] args) {
		double nota1 , nota2, nota3, media;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota: ");
		nota1 = in.nextDouble();
		
		System.out.println("Insira a segunda nota: ");
		nota2 = in.nextDouble();
		
		System.out.println("Insira a terceira nota: ");
		nota3 = in.nextDouble();
		
		media = ((nota1*2)+(nota2*3)+(nota3*5)/10);
		
		System.out.println("Nota Final: " + media);

		System.out.println();
	}

}

