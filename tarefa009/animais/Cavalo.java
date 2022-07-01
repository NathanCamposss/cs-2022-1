package animais;

public class Cavalo extends Animal {

    @Override
    public void emitirSom(){
        System.out.println("Relinchar");
        super.emitirSom();

    }
    
    public void movimentar(){
        System.out.println("Cavalo começou a correr");
        super.movimentar();

    }
}
