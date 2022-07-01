package produtos;

public class Produtos {

    private String nomeLoja;
    private float preco;
    String descricao;

    public String getDescricao() {
        return "Produto de informática";
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public float getPreco() {
        return preco;
    }


    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
}
