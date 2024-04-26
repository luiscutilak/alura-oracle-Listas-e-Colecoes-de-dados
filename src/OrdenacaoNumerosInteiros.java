import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumerosInteiros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(7);
        numeros.add(3);
        numeros.add(76);
        numeros.add(72);
        numeros.add(1);

        Collections.sort(numeros);
        System.out.println(numeros);
    }

}
