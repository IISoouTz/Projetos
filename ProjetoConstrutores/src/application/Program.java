package application;

import entities.Aluno;
import entities.Professor;

public class Program {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setMatricula("Etec Itaquera");
		aluno.setNome("Gustavo Franco");
		aluno.setEndereco("Rua Andréas de Silva");
		aluno.setBairro("Guaianazes");
		aluno.setSexo("Masculino");
		
		Professor professor = new Professor();
		
		professor.setMatricula("Etec Itaquera");
		professor.setNome("Alfredo");
		professor.setEndereco("Rua Manguinha");
		professor.setBairro("Barrafunda");
		professor.setSalario("3000");
		professor.setSexo("Masculino");
		
	}

}
