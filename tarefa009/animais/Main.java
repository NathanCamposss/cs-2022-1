package animais;

public class Main {
    public static void main(String[] args) {
        Veterinario veterinario = new Veterinario();
        veterinario.examinar(new Cavalo());
        veterinario.examinar(new Cachorro());
        veterinario.examinar(new Preguica());
    }
    
}
