package curso.java.alura.test.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesteIteratorDeUmaLista {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Super Mario");
        nomes.add("Yoshi");
        nomes.add("Donkey Kong");

        Iterator<String> it = nomes.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
