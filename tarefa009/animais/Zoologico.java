package animais;

import java.util.ArrayList;

public class Zoologico {
    public static void main(String[] args) {
        ArrayList<Animal> lista= new ArrayList<Animal>();
        lista.add(new Cachorro());
        lista.add(new Preguica());
        lista.add(new Cavalo());
        lista.add(new Preguica());
        lista.add(new Cavalo());
        lista.add(new Cavalo());
        lista.add(new Preguica());
        lista.add(new Cachorro());
        lista.add(new Cachorro());
        lista.add(new Cachorro());
        for(int i=0; i<10;i++){
            lista.get(i).emitirSom();
            if((lista.get(i) instanceof Cachorro) || (lista.get(i) instanceof Cavalo)){
                lista.get(i).movimentar();
            }
        }
    }
    
}
