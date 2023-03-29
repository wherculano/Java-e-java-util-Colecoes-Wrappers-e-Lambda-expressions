package curso.java.alura.test;

import curso.java.alura.modelo.Conta;
import curso.java.alura.modelo.ContaCorrente;
import curso.java.alura.modelo.GuardadorDeContas;

public class TesteGuardadorContas {
    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(11, 22);
        Conta cc2 = new ContaCorrente(33, 44);
//        Conta cc3 = new ContaCorrente(55, 66);

        GuardadorDeContas guardador = new GuardadorDeContas();

        guardador.adiciona(cc1);
        guardador.adiciona(cc2);
//        guardador.adiciona(cc3);  // Erro: ArrayIndexOutOfBoundsException (Index 2 out of bounds for length 2)

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencias(0);
        System.out.println(ref.getNumero());
    }
}
