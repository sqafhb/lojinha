package br.com.lojinha;
import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Sony", Tamanho.GRANDE);
        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(3999.00);

        List<String> itensInclusos = new ArrayList<>();
        itensInclusos.add("2 controles");
        itensInclusos.add("3 jogos");
        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getItensInclusos());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getValor());
    }
}
