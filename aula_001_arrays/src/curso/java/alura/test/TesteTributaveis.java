package curso.java.alura.test;

import curso.java.alura.modelo.CalculadorDeImposto;
import curso.java.alura.modelo.ContaCorrente;
import curso.java.alura.modelo.SeguroDeVida;

//classe TesteObject
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc= new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());

	}

}
