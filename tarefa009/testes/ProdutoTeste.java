package testes;
import java.util.ArrayList;

import produtos.*;
public class ProdutoTeste {

    public static void main(String[] args) {
        
        ArrayList<Produtos> carrinho = new ArrayList<Produtos>();
        

        carrinho.add( new Mouse("Mouse gamer", "Gamer"));
        carrinho.add(new Livro("Computação e sociedade","Wanderley"));
        carrinho.add( new Mouse("Mouse laser LGBTQ+", "Laser"));
        carrinho.add(new Livro("Orientação a objetos","Renata Dutra"));
        carrinho.add( new Mouse("Mouse sem fio voador", "Bluetooth"));
        carrinho.add(new Livro("Construção de softweares","Gilmar Arantes"));

        for(int i=0;i<6;i++){
            System.out.println(carrinho.get(i).getDescricao());
        }

        
    }
    
}
