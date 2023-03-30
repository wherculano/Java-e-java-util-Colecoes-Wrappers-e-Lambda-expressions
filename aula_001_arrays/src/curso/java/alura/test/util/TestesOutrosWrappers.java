package curso.java.alura.test.util;

import java.util.ArrayList;
import java.util.List;

public class TestesOutrosWrappers {
    public static void main(String[] args) {

        Integer idade = Integer.valueOf(34); // autoboxing
        System.out.println(idade.intValue()); // unboxing

        Double pi = Double.valueOf(3.14); // autoboxing
        System.out.println(pi.doubleValue()); // unboxing

        Boolean verdadeiro = Boolean.TRUE; // autoboxing
        System.out.println(verdadeiro.getClass());
        System.out.println(verdadeiro.booleanValue()); // unboxing

        // Number é a classe mais genérica.
        Number refNumeroInt = Integer.valueOf(34);  // pode ser simplificado apenas por = 34
        Number refNumeroDouble = Double.valueOf(34.6);  // pode ser simplificado apenas por = 34.6
        Number refNumeroFloat = Float.valueOf(34.6f);  // pode ser simplificado apenas por = 34.6

        List<Number> lista = new ArrayList<>();
        lista.add(refNumeroInt);
        lista.add(refNumeroDouble);
        lista.add(refNumeroFloat);

        System.out.println(lista);
    }
}
