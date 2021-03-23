package br.com.heranca;

public class Seguro  extends CadastroServico{
	private String carro;
	private double valorMenaslSeguro;
	private double valorFranquia;
	
	
	public void cadastrarSeguro(String cliente,String funcionario) {
		System.out.println("Cliente: " + cliente);
		System.out.println("Funcionario: " + funcionario);
		System.out.println("Veículo: " + this.carro);
		System.out.println("Valor Seguro: " + valorMenaslSeguro);
		System.out.println("Valor Franquia: " + valorFranquia);
		
	}
	
	
	public String getCarro() {
		return carro;
	}
	public void setCarro(String carro) {
		this.carro = carro;
	}
	public double getValorMenaslSeguro() {
		return valorMenaslSeguro;
	}
	public void setValorMenaslSeguro(double valorMenaslSeguro) {
		this.valorMenaslSeguro = valorMenaslSeguro;
	}
	public double getValorFranquia() {
		return valorFranquia;
	}
	public void setValorFranquia(double valorFranquia) {
		this.valorFranquia = valorFranquia;
	}
	
	
	

}
