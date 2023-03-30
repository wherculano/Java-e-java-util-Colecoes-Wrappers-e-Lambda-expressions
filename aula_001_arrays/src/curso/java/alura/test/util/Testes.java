package curso.java.alura.test.util;

import java.util.ArrayList;
import java.util.List;

public class Testes {
    public static void main(String[] args) {
        int[] idades = new int[2];
        String[] nomes = new String[2];

        int idade = 29;
        String nome = "Wagner";

        Integer idadeRef = Integer.valueOf(34); // int to Integer -> (auto)boxing, Integer to int -> unboxing
        
        List<Integer> numeros = new ArrayList<>();
        
        numeros.add(Integer.valueOf(idade)); // Lista não guarda primitivos (int, double, float, etc), apenas Referencias. 
        numeros.add(idadeRef); // Aqui guarda a Referencia de um objeto (Integer).

        System.out.println(numeros);
    }
}
