package br.com.generation.ifs;
import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		//leia 3 numeros e mostre em ordem decrescente//
		
		Scanner in = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Insira o primeiro numero: ");
		n1 = in.nextInt();
		System.out.println("Insira o segundo numero: ");
		n2 = in.nextInt();
		System.out.println("Insira o terceiro numero: ");
		n3 = in.nextInt();

		if(n1 >= n2 && n2 >= n3) {
			System.out.println("1�" + n1);
			System.out.println("2�" + n2);
			System.out.println("3�" + n3);
		}else if(n1 >= n2 && n2 <= n3) {
			System.out.println("1�" + n1);
			System.out.println("2�" + n3);
			System.out.println("3�" + n2);
		}else if(n2 >= n1 && n1 >= n3) {
			System.out.println("1�" + n2 );
			System.out.println("2�" + n1 );
			System.out.println("3�" + n3);
		}else if(n2>=n1 && n1 <= n3) {
			System.out.println("1�" + n2);
			System.out.println("2�" + n3);
			System.out.println("3�" + n1);
		}else if(n3 >= n1 && n1 >=n2) {
			System.out.println("1�" + n3);
			System.out.println("2�" + n2);
			 System.out.println("3�" + n1);
		}else if(n3 >=n1 && n1 <= n2) {
			System.out.println("1�" + n3);
			System.out.println("2�" + n1);
			System.out.println("3�" + n2);
		}
	}

}
