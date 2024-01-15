package br.com.screenmatch.modelos;

import br.com.screenmatch.excecao.ErroDeConversaoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{

    private String nome;
    private int anoDeLancamento;
    private boolean incuidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvalicoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {

        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoException("Não consegui converter o ano por que tem mais de 4 caracteres!");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,3));

    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncuidoNoPlano() {
        return incuidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvalicoes(){
        return totalDeAvalicoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncuidoNoPlano(boolean incuidoNoPlano) {
        this.incuidoNoPlano = incuidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }



    public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
    }


    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvalicoes ++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvalicoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }


    @Override
    public String toString() {
        return
                "(nome='" + nome + '\'' +
                ", anoDeLancamento=" + anoDeLancamento + "," +
                     "duração em minutos=" +  duracaoEmMinutos + ")";
    }
}
