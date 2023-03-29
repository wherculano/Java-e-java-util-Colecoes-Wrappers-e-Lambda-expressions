package curso.java.alura.test;

import curso.java.alura.modelo.ContaCorrente;
import curso.java.alura.modelo.ContaPoupanca;

public class TesteArrayDeObjetos {
    public static void main(String[] args) {
        Object[] referencias = new Object[2];

        ContaCorrente cc1 = new ContaCorrente(11, 33);
        ContaPoupanca cc2 = new ContaPoupanca(22, 44);

        referencias[0] = cc1;
        referencias[1] = cc2;

        ContaCorrente ref1 = (ContaCorrente) referencias[0];
        ContaPoupanca ref2 = (ContaPoupanca) referencias[1];

        // Como Object não possui os metodos de uma CC/CP, obrigatoriamente é necessario fazer o cast
        System.out.println(ref1.getAgencia());
        System.out.println(ref2.getAgencia());
    }
}
