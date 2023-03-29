package curso.java.alura.test.util;

import curso.java.alura.modelo.Conta;
import curso.java.alura.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListGenerics {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(11, 22);
        lista.add(cc1);

        Conta cc2 = new ContaCorrente(33, 44);
        lista.add(cc2);

        System.out.println("Tamanho da lista: " + lista.size());

        Conta conta = lista.get(0);
        System.out.println(conta);
        System.out.println(conta.getNumero());

        lista.remove(1);
        System.out.println("Tamanho da lista: " + lista.size());

        Conta cc3 = new ContaCorrente(44, 555);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(66, 777);
        lista.add(cc4);

        System.out.println("-".repeat(40));

        for (int i=0; i < lista.size(); i++){
            Object objRef = lista.get(i);
            System.out.println(objRef);
        }

        System.out.println("-".repeat(40));

        for(Conta cnt : lista){
            System.out.println(cnt);
        }

    }
}
