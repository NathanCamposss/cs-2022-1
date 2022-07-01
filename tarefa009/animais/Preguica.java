package animais;

public class Preguica extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Som de preguiça");
        super.emitirSom();
    }

    public void movimentar(){
        System.out.println("Preguiça começou a subir árvores");
        super.movimentar();

    }
    
}
