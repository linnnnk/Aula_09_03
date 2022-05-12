package Pack0903;


public class Funcionario {


String nome;
int salario;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}


	
	

	
	public double ganhoAnual() {
		double ganho;
		
		ganho = this.salario * 12;
		
		return ganho;
	}
	
	public void ExibeDados() {
		System.out.println("Nome: " + nome + " tem salario: " + salario);
		
	}
}


