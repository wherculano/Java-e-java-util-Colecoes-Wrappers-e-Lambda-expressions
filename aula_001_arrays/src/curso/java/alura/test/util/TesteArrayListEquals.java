package curso.java.alura.test.util;

import curso.java.alura.modelo.Conta;
import curso.java.alura.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(11, 22);
        lista.add(cc1);

        Conta cc2 = new ContaCorrente(33, 44);
        lista.add(cc2);

        System.out.println("Tamanho da lista: " + lista.size());

        System.out.println("-".repeat(40));

        for(Conta cnt : lista){
            System.out.println(cnt);
        }

        System.out.println("-".repeat(40));

        // cc3 possui mesma agencia e numero.
        Conta cc3 = new ContaCorrente(33, 44);
        System.out.println(lista.contains(cc3));

    }
}
