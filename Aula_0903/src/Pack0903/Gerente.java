package Pack0903;


public class Gerente extends Funcionario {
		
	public double bonus = 500;
	
	public double ganhoAnual() {
		double ganho;
		
		ganho = (super.getSalario() + bonus) * 12;
		
		return ganho;
	}

}