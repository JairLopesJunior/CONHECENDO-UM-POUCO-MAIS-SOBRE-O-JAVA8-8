package lambdas;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class MethodReferences {

    public static void main(String[] args) {
        // Os  method reference é uma forma compacta e fácil de expressão lambda.
        // Cada vez que estiver usando a expressão lambda apenas para se referir a um método.
        // Existe 4 tipos de method reference

        List<Carro> carros = asList(new Carro("Vermelho", 2010), new Carro("Amarelo", 2009), new Carro("Preto", 2007), new Carro("Azul", 2015));

        // 1- Reference  to a static method
        Collections.sort(carros, ComparadorCarro::comparePorCor);
        System.out.println(carros);

        // 2- Reference to an instance method of a particular object
        ComparadorCarro comparadorCarro = new ComparadorCarro();
        Collections.sort(carros, ComparadorCarro::comparePorAno);
        System.out.println(carros);

    }
}
