package curso.java.alura.test.util;

import curso.java.alura.modelo.Cliente;
import curso.java.alura.modelo.Conta;
import curso.java.alura.modelo.ContaCorrente;
import curso.java.alura.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class TesteLambda {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Wagner");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Matheus");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Danielle");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Milena");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);


        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("-".repeat(13) + " LISTA ORDENADA PELO NUMERO " + "-".repeat(13));

        // Lambda de uma linha pode-se omitir o return
        lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));

        for (Conta conta : lista) {
            System.out.println(conta + " -> " + conta.getTitular().getNome());
        }

        System.out.println("-".repeat(14) + " LISTA ORDENADA PELO NOME " + "-".repeat(14));

        // Lambda: como o item da lista tem que ser uma Conta, então não é necessario "tipar" novamente os c1 e c2
        lista.sort((c1, c2) -> {
                    String nomeClienteC1 = c1.getTitular().getNome();
                    String nomeClienteC2 = c2.getTitular().getNome();
                    return nomeClienteC1.compareTo(nomeClienteC2);
                }
        );

        for (Conta conta : lista) {
            System.out.println(conta + " -> " + conta.getTitular().getNome());
        }

        System.out.println("-".repeat(14) + " LISTA ORDENADA PELO SALDO " + "-".repeat(14));

        Collections.sort(lista);
        for (Conta conta : lista) {
            System.out.println(conta + " -> " + conta.getTitular().getNome());
        }

        System.out.println("-".repeat(15) + " LACO 'FOR' PELA PROPRIA LISTA " + "-".repeat(15));
        lista.forEach( (conta) -> System.out.println(conta + " -> " + conta.getTitular().getNome()));

        // for da lista sem uso de Lambda
//        lista.forEach(new Consumer<Conta>() {
//            @Override
//            public void accept(Conta conta) {
//                System.out.println(conta + " -> " + conta.getTitular().getNome());
//            }
//        });
    }
}
