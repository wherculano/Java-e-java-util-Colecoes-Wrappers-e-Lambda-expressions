package curso.java.alura.test;

import curso.java.alura.modelo.ContaCorrente;
import curso.java.alura.modelo.ContaPoupanca;
import curso.java.alura.modelo.SaldoInsuficienteException;

//test.curso.java.alura.TesteContas
public class TesteContas {

	//java.lang.String
	public static void main(String[] args) throws SaldoInsuficienteException{
						
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());


	}

}
