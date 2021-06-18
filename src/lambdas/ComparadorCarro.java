package lambdas;

public class ComparadorCarro {

    public static int comparePorCor(Carro c1, Carro c2){
        return c1.getCor().compareTo(c2.getCor());
    }

    public static int comparePorAno(Carro c1, Carro c2){
        return Integer.toString(c1.getAno()).compareTo(Integer.toString(c2.getAno()));
    }
}
