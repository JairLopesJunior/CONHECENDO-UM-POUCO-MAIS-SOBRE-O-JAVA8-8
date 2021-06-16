package lambdas;

import java.util.function.Predicate;

public class PredicateExemplo {

    // LAMBDA foi criado para acabar com a verbosidade, pela quantidade de códigos que temos no JAVA.
    public static void main(String[] args) {

        // LAMBDA é Anonima, é uma função, é passada por argumento ou pode-se guardar em uma variavel e também é concisa

        // PREDICATE é uma Interface Funcional, que contem somente um metodo abstrato assim como todas Interfaces Funcionais. E retorna o tipo Boolean.

        Predicate<Carro> c = (Carro carro)  -> carro.getCor().equals("verde");

        System.out.println(c.test(new Carro("azul", 2020)));
        System.out.println(c.test(new Carro("verde", 2020)));
    }
}
