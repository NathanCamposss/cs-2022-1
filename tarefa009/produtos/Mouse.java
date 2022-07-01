package produtos;

public class Mouse extends Produtos{
    String tipo;

    public Mouse(String descricao){
        this.descricao = descricao;

    }

    public Mouse(String descricao, String tipo){
        this.descricao = descricao;
        this.tipo = tipo;

    }

    @Override
    public String getDescricao() {
        

        super.getDescricao();
        return "Descrição: "+this.descricao+" Autor: "+this.tipo;
    }
    
}
