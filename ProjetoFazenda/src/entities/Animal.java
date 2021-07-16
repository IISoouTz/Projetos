package entities;

public class Animal {

	private int idade;
	private float peso;
	private String nome;
	
	public Animal () {
		
	}
	
	public Animal (int idade, float peso, String nome) {
		this.idade=idade;
		this.nome=nome;
		this.peso=peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String som() {
		return "Som do animal";
	}
}
