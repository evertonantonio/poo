package ex04;

public class ImovelNovo extends Imovel{

	public ImovelNovo(String endereco, double preco) {
		super(endereco, preco);
	}

	@Override
	public void dados() {
		System.out.println("O endereço da casa é: " + super.getEndereco());
		System.out.println("O valor da casa é de: R$" + (super.getPreco() + 2000));
	}
	
	
}
