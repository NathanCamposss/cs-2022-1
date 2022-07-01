package produtos;

public class Livro extends Produtos{
    String autor;

    public Livro(String descricao){
        this.descricao = descricao;

    }

    public Livro(String descricao, String autor){
        this.descricao = descricao;
        this.autor=autor;

    }

    @Override
    public String getDescricao() {
        

        super.getDescricao();
        return "Descrição: "+this.descricao+" Autor: "+this.autor;
    }
    
}
