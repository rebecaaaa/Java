package br.com.generation.exer;

public class TestaAviao {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();
		
		aviao1.setModelo("Boeing 707");
		aviao1.setAno(2015);
		aviao1.setVoo("Doméstico");
		aviao1.setAssentos(220);
		
		Aviao aviao2 = new Aviao();
		
		aviao2.setModelo("Airbus 503");
		aviao2.setAno(2011);
		aviao2.setVoo("Internacional");
		aviao2.setAssentos(370);
		
		
		System.out.println("Modelo: " + aviao1.getModelo());
		System.out.println("Ano: " + aviao1.getAno());
		System.out.println("Tipo de vôo: " + aviao1.getVoo());
		System.out.println("Assentos totais: " + aviao1.getAssentos());
		System.out.println();
		System.out.println("Modelo: " + aviao2.getModelo());
		System.out.println("Ano: " + aviao2.getAno());
		System.out.println("Tipo de vôo: " + aviao2.getVoo());
		System.out.println("Assentos totais: " + aviao2.getAssentos());
		
	}

}
