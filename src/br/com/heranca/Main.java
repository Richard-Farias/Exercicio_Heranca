package br.com.heranca;

import java.text.DecimalFormat;


public class Main {

	public static void main(String[] args) {
		Cliente cliente01 = new Cliente();
		Funcionario funcionario01 = new Funcionario();
		
		cliente01.setNome("Richard Soares Farias");
		cliente01.setCpf(117823547);
		cliente01.setDataNascimento("18/08/80");
		cliente01.setTelefone("(31)3477-89-75");
		
		funcionario01.setNomeFuncionario("Leandro Alcantra");
		funcionario01.setCpfFuncionario(3782547);
		funcionario01.setCargo("Vendedor");
		funcionario01.setDataAdmissao("31/02/2019");
		
		Seguro segurado = new Seguro();
		segurado.setCarro("Palio Atractive");
		segurado.setDataContrato("22/03/21");
		segurado.setValorMenaslSeguro(130.90);
		segurado.setValorFranquia(1800.00);
		
		Emprestimo emprestimo01 = new Emprestimo();
		emprestimo01.setDataContrato("22/03/21");
	

		
		
		
		StringBuilder msg = new StringBuilder();
			
		System.out.println("====== Seguro * Alto ======");
		System.out.println(" ");
		segurado.cadastrarSeguro(cliente01.getNome(), funcionario01.getNomeFuncionario());
		
		System.out.println(" ");
		System.out.println("====== $ Empréstimo $ ======");

		
		
		
		
	}

}
