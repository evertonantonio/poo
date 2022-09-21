package ex01;

public class AssistenteAdm extends Assistente{

	private double bonus;
	
	public AssistenteAdm (String nome, double salario, String matricula, double bonus) {
		super(nome,salario,matricula);
		this.bonus = bonus;
	}
	
	
	

	@Override
	public double ganhoAnual() {
		return (super.getSalario() * 12) + this.bonus;
	}




	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
}
