package entities;

public class carroSemiNovo extends carroNovo {

	
	public float valorAdicional;
	
	public carroSemiNovo() {
	
	}

	public carroSemiNovo(float valorAdicional, String montadora, int anoFabricacao, float preco) {
		super(montadora, anoFabricacao, preco);
		this.valorAdicional=valorAdicional;
		this.valorAdicional=valorAdicional;
	}
	
	public float getValorAdcional() {
		return valorAdicional;
	}

	public void setValorAdcional(float valorAdcional) {
		this.valorAdicional = valorAdcional;
	}
	
}
