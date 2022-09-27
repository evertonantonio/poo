package q2;

public class ClienteFidelidadeEspecial extends ClienteFidelidade{

	public ClienteFidelidadeEspecial(String nome, String endereco, double valor, double bonus, String validade) {
		super(nome, endereco, valor,bonus,validade);
	}

	@Override
	public void pegarPromocao() {
		super.setValor((super.getBonus() - (super.getValor() - (super.getValor() * 0.1))) * -1);
	}
	
	
}
