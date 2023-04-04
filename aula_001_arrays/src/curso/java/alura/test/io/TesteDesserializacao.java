package curso.java.alura.test.io;


import curso.java.alura.modelo.ContaCorrente;

import java.io.*;


public class TesteDesserializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "aula_001_arrays/src/curso/java/alura/test/io/contaCorrente.bin";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
        ContaCorrente cc = (ContaCorrente) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(cc);
    }
}
