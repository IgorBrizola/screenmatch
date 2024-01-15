package br.com.screenmatch.principal;

import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.calculos.FiltroRecomendacao;
import br.com.screenmatch.modelos.Episodio;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {


        Filme meuFilme = new Filme("Vingadores",2012);

        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.avalia(7);
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.avalia(7);
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.avalia(7);
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.avalia(7);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.avalia(10);





        System.out.println("Total de avaliação: " + meuFilme.getTotalDeAvalicoes());
        System.out.println("Média de avaliações  : " + meuFilme.pegaMedia());
        System.out.println("Total de estrelas: " + meuFilme.getClasssificacao());


        Serie lost = new Serie("Lost", 2000);


        lost.setTemporadas(4);
        lost.setEpisodiosPorTemporada(10);
        lost.setminutosPorEpisodio(45);

        lost.exibeFichaTecnica();

        System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("Vingadores Ultimato", 2021);

        outroFilme.setDuracaoEmMinutos(180);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);

        calculadora.inclui(lost);

        System.out.println("Para você conseguir fazer sua maratona reserve: " + calculadora.getTempoTotal() + " minutos");


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);


        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVizualizacoes(300);
        System.out.println("Episodio " + episodio.getNumero() + " de lost" );
        filtro.filtra(episodio);


        Filme filmeDoIgor = new Filme("Vingadores a era de ultron",2015);

        filmeDoIgor.setDuracaoEmMinutos(200);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoIgor);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);
        System.out.println("Tamanho da Lista: " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

        calculadora.inclui(filmeDoIgor);

        System.out.println("Para você conseguir fazer sua maratona reserve: " + calculadora.getTempoTotal() + " minutos");






    }
}