package br.com.lojinha.pojo;

public class ItemIncluso {
    private String nome;
    private int quantidade;

    public ItemIncluso(String nomeInicial, int quantidadeInicial){
        this.nome = nomeInicial;
        this.quantidade = quantidadeInicial;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public int getQuantidade() {
        return quantidade;

    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
