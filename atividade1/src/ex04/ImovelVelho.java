package ex04;

public class ImovelVelho extends Imovel{

	public ImovelVelho(String endereco, double preco) {
		super(endereco, preco);
	}

	@Override
	public void dados() {
		System.out.println("O endere�o da casa �: " + super.getEndereco());
		System.out.println("O valor da casa � de: R$" + (super.getPreco() - 2000));
	}
}
