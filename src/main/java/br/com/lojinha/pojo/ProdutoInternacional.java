package br.com.lojinha.pojo;
import br.com.lojinha.Interfaces.Favorito;
import br.com.lojinha.enums.Tamanho;

public class ProdutoInternacional extends Produto implements Favorito {
    private double importacao;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public void setValor(double novoValor) {
        if (novoValor > -100) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que -100");
        }
    }

    public double getImportacao() {
        return importacao;
    }

    public void setImportacao(double novoImportacao) {
        this.importacao = novoImportacao;
    }

    public String getDadosFavoritos() {
        return this.getNome() +", " + this.getMarca() +" e " + this.getValor();
    }
}
