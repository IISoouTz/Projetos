package application;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Gustavo Franco");
		funcionario.setRg("920211023");
		funcionario.setCartao("130203433343");
		
		//System.out.println("Nome : " + funcionario.getNome());
		//System.out.println("RG : " + funcionario.getRg());
		//System.out.println("Cart�o : " + funcionario.getCartao());
		
		System.out.println(funcionario);

	}

}
