package exemplotesteunitario;

public class Calculos {

    public ParOuImpar parOuImpar(int n) {
        if (n==0){
            return ParOuImpar.ZERO;
        }
        if (n % 2==0) {
            return ParOuImpar.PAR;
        }
        return ParOuImpar.IMPAR;

    }

}
