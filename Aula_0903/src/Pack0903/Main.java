package Pack0903;

public class Main {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Funcionario f = new Tecnico();
	
	f.setNome("Nickerson");
	f.setSalario(1000);
	f.ExibeDados();
	System.out.println(f.ganhoAnual());
	
	
	Funcionario f2 = new Funcionario();
	f2.setNome("Mariano");
	f2.setSalario(1000);
	f2.ExibeDados();
	System.out.println(f2.ganhoAnual());
	
	Funcionario f3 = new Gerente();
	f2.setNome("Luwiz");
	f2.setSalario(1000);
	f2.ExibeDados();
	System.out.println(f3.ganhoAnual());
	
	
	
	
         }
}