package br.com.generation.vetor;

	import java.util.Scanner;

public class exe1 {

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int  maior= 0;
			
				int[] notas = new int[5];
			
			 for(int i = 0; i <=4; i++) {
				 System.out.println("Digite as notas: ");
				 notas[i] = in.nextInt(); 
				 if(notas[i] > maior);{
					 maior = notas[i];
					 
					 System.out.println(i);
				 }
			 }

		}

	}


