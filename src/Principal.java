import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        var halo = new Serie();
        halo.setNome("Halo");
        halo.setTemporadas(2);
        halo.setMinutosPorEpisodio(55);
        halo.setTemporadas(8);
        halo.setAnoDeLancamento(2022);
        System.out.println("Duração para maratonar Halo" + halo.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


        var filmeDoPaulo = new Filme();
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.setNome("Dogville");

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(filmeDoPaulo);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " +listaDeFilmes.get(0));
        System.out.println(listaDeFilmes);

        ArrayList<Serie> listaDeSeries = new ArrayList<>();
        listaDeSeries.add(halo);
        listaDeSeries.add(lost);

        System.out.println("Tamanho da lista: " + listaDeSeries.size());
        System.out.println("Comprimento da lista: " + listaDeSeries.toArray().length);
        System.out.println(listaDeSeries);

    }
}