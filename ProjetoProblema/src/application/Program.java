package application;

import entities.carroNovo;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		carroNovo carroN = new carroNovo();
		
		
		carroN.setMontadora("Fiat");
		carroN.setanoFabricacao("2017");
		carroN.setpreco("70000");
		
		System.out.println(carroN);
		
	}

}
