package lambdas;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class LambdaTiposPrimitivos {

    public static void main(String[] args) {
        // Interfaces Funcionais que trabalham com Tipos Primitivos, melhora na Performace, melhor do que utilizar Wrappers

        IntPredicate par = (int numero) -> numero % 2 == 0;

        // DoublePredicate
        // LongPredicate

        System.out.println(par.test(1548));
        System.out.println(par.test(14857));
    }
}
