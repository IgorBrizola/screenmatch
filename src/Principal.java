import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {


        Filme meuFilme = new Filme();

        meuFilme.setNome("Vingadores");
        meuFilme.setAnoDeLancamento(2012);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.avalia(7);
        meuFilme.avalia(8);
        meuFilme.avalia(9);


        System.out.println("Total de avaliação: " + meuFilme.getTotalDeAvalicoes());
        System.out.println("Média de avaliações  : " + meuFilme.pegaMedia());

    }
}