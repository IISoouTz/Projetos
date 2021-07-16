package entities;

public class Zebra extends Animal {

	public Zebra () {
		
	}
	
	public Zebra (int idade, float peso, String nome) {
		super (idade, peso, nome);
	}
	
	public String som (String cor) {
		return "A zebra de cor " + cor + " faz barulho: HIIIIIMMMMMMMMM";
	}
}
