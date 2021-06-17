package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionExemplo {

    public static void main(String[] args) {
        // A Interface Funcional Function recebe dois parametros, o primeiro é o que ela vai receber como parametro, o segundo  é  o  que  ela vai retornar.

        Function<String, Integer> retorneTamanhoString = ( (String nome) -> nome.length() );

        System.out.println(retorneTamanhoString.apply("Jair"));
    }
}
