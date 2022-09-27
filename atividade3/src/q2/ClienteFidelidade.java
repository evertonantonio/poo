package q2;

public class ClienteFidelidade extends Cliente{

	private double bonus;
	private String validade;
	
	public ClienteFidelidade(String nome, String endereco, double valor, double bonus, String validade) {
		super(nome,endereco,valor);
		this.bonus = bonus;
		this.validade = validade;
	}
	
	public void pegarPromocao() {
		super.setValor((bonus - (super.getValor() - (super.getValor() * 0.05))) * -1);
	}
	

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}
	
	
}
