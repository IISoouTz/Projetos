package entities;

public class carroNovo {

	public String montadora;
	public int anoFabricacao;
	public float preco;
	
	public carroNovo() {
		
	}
	
	public String getMontadora() {
		return montadora;
	}
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public String toString() {
		return "Montadora : " + getMontadora()+
				", anoFabricacao: " + getAnoFabricacao()+
				", preco : "+ preco;
	
	}
	
	
	
}
