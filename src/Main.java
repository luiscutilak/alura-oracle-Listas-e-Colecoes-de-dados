import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Titulo> listaDetitulos = new ArrayList<>();

        listaDetitulos.add(new Titulo("Dogville"));
        listaDetitulos.add(new Titulo("Missão Impossivel"));
        listaDetitulos.add(new Titulo("TopGun"));
        listaDetitulos.add(new Titulo("Avatar"));

        Collections.sort(listaDetitulos);

        for (Titulo titulo : listaDetitulos) {
            System.out.println(titulo.getNome());

        }


    }

}
