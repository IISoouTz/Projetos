package entities;

public class Vaca extends Animal {

	public Vaca() {
		
	}
	
	public Vaca (int idade, float peso, String nome) {
		super (idade, peso, nome);
	}
	
	
	public String som() {
		return "A vaca " + getNome() + " faz barulho: Muuuu!";
	}
	
}
