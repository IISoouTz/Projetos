package entities;

public class Gato extends Animal {
	
	public Gato() {
		
	}
	
	public Gato (int idade, float peso, String nome) {
		super (idade, peso, nome);
	}
	
	

	public String som() {
		return "O Gato " + getNome() + " faz barulho: Miaaau!";
	}
}
