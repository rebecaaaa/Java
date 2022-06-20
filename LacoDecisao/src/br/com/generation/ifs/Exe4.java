package br.com.generation.ifs;
import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		//leia 3 numeros e mostre o maior
		
		Scanner in = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Insira o primeiro numero: ");
		n1 = in.nextInt();
		System.out.println("Insira o segundo numero: ");
		n2 = in.nextInt();
		System.out.println("Insira o terceiro numero: ");
		n3 = in.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println(n1 + ", o primeiro número, é o maior" );
		}else if(n2 > n1 && n2 > n3) {
			System.out.println(n2 + ", o segundo número, é o maior" );
		}else if(n3 > n1 && n3 > n2) {
			System.out.println(n3 + ", o terceiro número, é o maior" );
		}else if(n1 == n2) {
			System.out.println("Digite três números diferentes" );
		}else if(n2 == n3) {
			System.out.println("Digite três números diferentes");
		}else if(n1 == n3) {
			System.out.println("Digite três números diferentes");
		}
	}

}
