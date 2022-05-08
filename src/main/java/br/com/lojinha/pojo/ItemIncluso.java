package br.com.lojinha.pojo;

public class ItemAdicional {
    private String nome;
    private int quantidade;

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
