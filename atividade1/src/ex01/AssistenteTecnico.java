package ex01;

public class AssistenteTecnico extends Assistente {

	private boolean noturno;
	
	public AssistenteTecnico(String nome, double salario , String matricula , boolean noturno) {
		super(nome, salario, matricula);
		this.noturno = noturno;
	}

	
	
	@Override
	public double ganhoAnual() {
		if(noturno) {
			return (super.getSalario() + 700) * 12;
		}else {
			return super.getSalario() * 12;
		}
	}




	public boolean isNoturno() {
		return noturno;
	}

	public void setNoturno(boolean noturno) {
		this.noturno = noturno;
	}
	
	
}
