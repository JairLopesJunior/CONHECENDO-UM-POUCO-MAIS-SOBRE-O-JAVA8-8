package lambdas;

import java.util.function.Supplier;

public class SupplierExemplo {

    public static void main(String[] args) {

        // A Interface Funcional Supplier não recebe nenhum parametro e retorna qualquer coisa que desejar.

        Supplier<Carro> retornaCarro = () -> new Carro("Amarelo", 2012);
        Supplier<String> retornaNome = () -> "Jair";

        System.out.println(retornaCarro.get());
        System.out.println(retornaNome.get());
    }
}
