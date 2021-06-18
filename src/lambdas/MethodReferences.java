package lambdas;

import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

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

        // 3- Reference to an  instance method of an arbitrary object of a particular type
        List<String> nomes = asList("Willian", "DevDojo", "Anna", "Brenon");
        nomes.sort( (n1, n2) -> n1.compareTo(n2) );
        nomes.sort(String::compareTo);
        System.out.println(nomes);

        Function<String, Integer> stringToInteger = (String a) -> Integer.parseInt(a);
        Function<String, Integer> stringToInteger2 = Integer::parseInt;
        System.out.println(stringToInteger2.apply("10"));

        BiPredicate<List<String>, String> contains = (lista, elemento) -> lista.contains(elemento);
        BiPredicate<List<String>, String> contains2 = List::contains;
        System.out.println(contains2.test(nomes, "Willian"));

        // 4- References to a constructor
        Supplier<ComparadorCarro> comparadorCarroSupplier = ComparadorCarro::new;
        System.out.println(comparadorCarroSupplier.get()); // Precisa utilizar o .get() para chamar a nova instancia

        BiFunction<String, Integer, Carro> carroBiFunction = (s, i) -> new Carro(s, i);
        BiFunction<String, Integer, Carro> carroBiFunction2 = Carro::new;
        System.out.println(carroBiFunction2.apply("Rosa",  1998));
    }
}
