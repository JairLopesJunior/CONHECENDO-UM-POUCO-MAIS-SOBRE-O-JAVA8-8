package lambdas;

import java.util.function.Consumer;

public class ConsumerExemplo {

    public static void main(String[] args) {
        // A Interface Funcional Consumer recebe um Generico e retorna Void, ou seja, pode exibir os valores.

        Consumer<String> exibirNome = ( (String nome) -> System.out.println(nome) );

        exibirNome.accept("Jair");
    }
}
