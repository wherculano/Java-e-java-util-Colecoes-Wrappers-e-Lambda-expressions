package curso.java.alura.test.util;

import java.util.ArrayList;
import java.util.List;

public class TestesWrapperInteger {
    public static void main(String[] args) {

        String strNumero = "29";

        System.out.println(strNumero + " -> " + strNumero.getClass());
        Integer idadeRef = Integer.valueOf(34); // int to Integer -> (auto)boxing, Integer to int -> unboxing

        Integer intNumero = Integer.valueOf(strNumero);
        System.out.println(intNumero + " -> " + intNumero.getClass());

        Integer outroInt = Integer.parseInt(strNumero);
        System.out.println(outroInt + " -> " + outroInt.getClass());

        System.out.println("-".repeat(15) + " Parsing " + "-".repeat(15));

        System.out.println(outroInt.doubleValue());
        System.out.println(outroInt.floatValue());
        System.out.println(outroInt.byteValue());
        System.out.println(outroInt.longValue());
        System.out.println(outroInt.shortValue());
        System.out.println(outroInt.toString());

        System.out.println("-".repeat(40));

        int idade = 29;
        List<Integer> numeros = new ArrayList<>();
        numeros.add(Integer.valueOf(idade)); // Lista não guarda primitivos (int, double, float, etc), apenas Referencias. 
        numeros.add(idadeRef); // Aqui guarda a Referencia de um objeto (Integer).

        System.out.println(numeros);

        System.out.println("Menor valor possivel para um Integer: " + Integer.MIN_VALUE);
        System.out.println("Maior valor possivel para um Integer: " + Integer.MAX_VALUE);
        System.out.println("Quanto bytes tem um Integer: " + Integer.BYTES);
        System.out.println("Quanto bits tem um Integer: " + Integer.SIZE);
    }
}
