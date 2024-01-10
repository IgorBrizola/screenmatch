package br.com.screenmatch.modelos;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incuidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvalicoes;
    private int duracaoEmMinutos;



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

}
