package br.com.lojinha.pojo;
import br.com.lojinha.Interfaces.Favorito;
import br.com.lojinha.enums.Tamanho;

public class ProdutoNacional extends Produto implements Favorito {
    private double imposto;

    public ProdutoNacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double novoImposto) {
        this.imposto = novoImposto;
    }

    @Override
    public String getDadosFavoritos() {
        return this.getNome() +", " + this.getMarca() +" e " + this.getValor();
    }
}
