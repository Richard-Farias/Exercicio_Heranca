package br.com.heranca;

public class CadastroServico{
	private Cliente cliente;
	private Funcionario  funcionario;
	private String dataContrato;
	
	
	
	public double calcularTaxa(double valorMensal) {
		return valorMensal  * 0.1;
	}
	
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
	public String getDataContrato() {
		return dataContrato;
	}
	public void setDataContrato(String dataContrato) {
		this.dataContrato = dataContrato;
	}
	
	
	
	

}
