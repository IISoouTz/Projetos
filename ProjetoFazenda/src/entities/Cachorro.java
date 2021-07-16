package entities;

public class Cachorro extends Animal {

	public Cachorro() {
		
	}
	
	public Cachorro (int idade, float peso, String nome) {
		super (idade, peso, nome);
	}
	
	
	
	public String som() {
		return "O Cachorro " + getNome() + " faz barulho: auau!";
	}
	
}
