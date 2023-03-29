package curso.java.alura.test;

public class TesteArrayStrings {
    public static void main(String[] args) {
        System.out.println("Entrei no sistema!");
        // Este 'for' só será impresso se o programa for chamado pela linha de comando.
        for (String arg : args) {
            System.out.println(arg);
        }
        //for(int i=0; i < args.length; i++){
        //    System.out.println(args[i]);
        //}  // este FOR é a mesma coisa que o FOR acima.
    }
}
