package br.com.heranca;

public class Emprestimo extends CadastroServico {

	private Cliente cliente;
	private Funcionario funcionario;
	double valorEmprestimo;
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public double getValorEmprestimo() {
		return valorEmprestimo;
	}
	public void setValorEmprestimo(double valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}
	
	

}
