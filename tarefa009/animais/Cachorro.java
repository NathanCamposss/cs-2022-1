package animais;

public class Cachorro extends Animal {
    @Override
    public void emitirSom(){
        System.out.println("Latir");
        super.emitirSom();
    }

    
    public void movimentar(){
        System.out.println("Cachorro começou a correr");
        super.movimentar();

    }
    
}
