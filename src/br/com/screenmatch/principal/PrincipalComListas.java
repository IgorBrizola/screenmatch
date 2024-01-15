package br.com.screenmatch.principal;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Vingadores",2012);
        meuFilme.avalia(9);
        meuFilme.avalia(9);
        meuFilme.avalia(6);
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        Filme outroFilme = new Filme("Vingadores Ultimato", 2021);
        outroFilme.avalia(10);
        outroFilme.avalia(3);
        outroFilme.avalia(7);
        outroFilme.avalia(7);
        outroFilme.avalia(9);

        Filme filme1 = new Filme("Avatar",2023);
        filme1.avalia(10);
        filme1.avalia(8);
        filme1.avalia(6);
        filme1.avalia(9);
        filme1.avalia(10);

        Filme filmeDoIgor = new Filme("Vingadores a era de ultron",2015);
        filmeDoIgor.avalia(10);
        filmeDoIgor.avalia(8);
        filmeDoIgor.avalia(6);
        filmeDoIgor.avalia(9);
        filmeDoIgor.avalia(10);

        Serie lost = new Serie("Lost", 2000);


        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoIgor);
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(filme1);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClasssificacao() > 2){
                System.out.println("Total de Avaliações: " + filme.getTotalDeAvalicoes());
                System.out.println("Classificação: " + filme.getClasssificacao());
            }
        }
//
//        ArrayList<String> buscaPorArtitsta = new ArrayList<>();
//        buscaPorArtitsta.add("Wiu");
//        buscaPorArtitsta.add("Derek");
//        buscaPorArtitsta.add("Matue");
//        buscaPorArtitsta.add("Ryu The Runner");
//        buscaPorArtitsta.add("Veigh");
//        buscaPorArtitsta.add("Jé Santiago");
//        buscaPorArtitsta.add("Defideliz");
//
//
//        System.out.println(buscaPorArtitsta);
//        Collections.sort(buscaPorArtitsta);
//        System.out.println("Depois da ordenação");
//        System.out.println(buscaPorArtitsta);


        System.out.println("Lista de titulos ordenadas por ordem alfabetica:");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: " );
        System.out.println(lista);


    }
}
