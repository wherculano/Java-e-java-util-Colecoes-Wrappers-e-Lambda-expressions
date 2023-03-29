package curso.java.alura.test;

public class Teste {
    public static void main(String[] args) {
        // Arrays possuem valores pré definidos e fixos.
        int[] idades = new int[5];
        System.out.println("Tamanho do array: " + idades.length);

        for (int i=0; i < idades.length; i++){
            idades[i] = (int) Math.pow(i, 2);  // i^2 e forçando o cast uma vez que o array so aceita int.
            System.out.println(idades[i]);
        }
    }
}
