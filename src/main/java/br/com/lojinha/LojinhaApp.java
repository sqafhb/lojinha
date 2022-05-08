package br.com.lojinha;
import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Sony", Tamanho.GRANDE);
        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(30);

        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getValor());

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Jogo", 3);
        itensInclusos.add(primeiroItemIncluso);

        ItemIncluso segundoItemIncluso = new ItemIncluso("Controles", 2);
        itensInclusos.add(segundoItemIncluso);

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabo de Energia", 2);
        itensInclusos.add(terceiroItemIncluso);

        meuProduto.setItensInclusos(itensInclusos);

        for (ItemIncluso itemAtual : meuProduto.getItensInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }
    }
}
