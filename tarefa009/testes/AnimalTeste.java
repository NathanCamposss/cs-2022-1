package testes;



import animais.Animal;
import animais.Cachorro;
import animais.Cavalo;
import animais.Preguica;


public class AnimalTeste {

    public static void main(String[] args) {
        

        Animal animal = new Cavalo();
        animal.emitirSom();
        animal = new Preguica();
        animal.emitirSom();
        animal = new Cachorro();
        animal.emitirSom();
        
        
        
    }
}
