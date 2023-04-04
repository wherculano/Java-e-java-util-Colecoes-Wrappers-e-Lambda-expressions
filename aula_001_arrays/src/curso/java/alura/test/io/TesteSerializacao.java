package curso.java.alura.test.io;

import curso.java.alura.modelo.Cliente;
import curso.java.alura.modelo.ContaCorrente;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Cliente cliente = new Cliente();
        cliente.setNome("Wagner Herculano");
        cliente.setProfissao("Python Developer");
        cliente.setCpf("111.222.333-45");

        System.out.println(cliente.getNome());

        ContaCorrente contaCorrente = new ContaCorrente(123, 456);
        contaCorrente.setTitular(cliente);
        contaCorrente.deposita(200000);

        // Serializacao
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("aula_001_arrays/src/curso/java/alura/test/io/contaCorrente.bin"));
        objectOutputStream.writeObject(contaCorrente);
        objectOutputStream.close();
    }
}
