package br.com.generation.matriz;

import java.util.Random;

public class exe1 {

	public static void main(String[] args) {
		int [][] n1 = new int[4][4];
		int [][] n2 = new int[4][4];
		int [][] m1 = new int[4][4];
		int [][] m2 = new int[4][4];
		
		Random numeroRandom = new Random();
		
		for (int i=0; i<n1.length; i++) {
			for(int j=0; j < n1[i].length; j++) {
				n1[i][j] = numeroRandom.nextInt(20);
				System.out.println("Matriz n1");
				System.out.printf(n1[i][j] + "|");
			}
		}
		for (int i=0; i<n1.length; i++) {
			for(int j=0; j < n1[i].length; j++) {
				n2[i][j] = numeroRandom.nextInt(20);
				System.out.println("Matriz n2");
				System.out.printf(n2[i][j] + "|");
			}
		}
		
		for(int i =0; i < m1.length; i++){
			for(int j=0; j< m1[i].length; j++) {
				m1[i][j] = n1[i][j] + n2[i][j];
				System.out.println("Matriz m1");
				System.out.printf(m1[i][j]+ "|");
				
			}
		}
		for(int i =0; i < m1.length; i++){
			for(int j=0; j< m1[i].length; j++) {
				m2[i][j] = n1[i][j] - n2[i][j];
				System.out.println("Matriz m1");
				System.out.printf(m2[i][j]+ "|");
				
			}
		}
		
		
	}

}
