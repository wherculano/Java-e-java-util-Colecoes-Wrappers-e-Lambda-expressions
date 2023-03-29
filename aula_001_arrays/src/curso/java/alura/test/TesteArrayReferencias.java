package curso.java.alura.test;

import curso.java.alura.modelo.ContaCorrente;

public class TesteArrayReferencias {
    public static void main(String[] args) {
        ContaCorrente[] contas = new ContaCorrente[2];

        ContaCorrente cc1 = new ContaCorrente(11, 33);
        ContaCorrente cc2 = new ContaCorrente(22, 44);

        contas[0] = cc1;
        contas[1] = cc2;

        System.out.println(contas[0].getAgencia());
        System.out.println(contas[1].getAgencia());

        ContaCorrente refCc1 = contas[0];
        System.out.println(refCc1.getAgencia());
    }
}
