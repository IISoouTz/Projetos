package application;

import entities.Cachorro;
import entities.Gato;
import entities.Vaca;
import entities.Zebra;

public class Program {

	public static void main(String[] args) {
		
		Cachorro cachorrinho = new Cachorro();
		cachorrinho.setNome("Ozzy");
		System.out.println(cachorrinho.som());
		
		Gato gatinho = new Gato();
		gatinho.setNome("Garfield");
		System.out.println(gatinho.som());
		
		Vaca vaquinha = new Vaca();
		vaquinha.setNome("Jubiscreusa");
		System.out.println(vaquinha.som());
		
		Zebra zebrinha = new Zebra();
		System.out.println(zebrinha.som("Azul"));
		

	}

}
