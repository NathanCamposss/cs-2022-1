import animais.*;
import java.util.ArrayList;
import java.util.List;

public class UsoGenerics {
    public void verAnimais(List<? extends Animal> animal){
        for(Animal aux: animal){
            System.out.println(aux.toString());
        }
    }

    public static void main(String[] args) {
        List<Animal> animal = new ArrayList<>();
        List<Arara> arara = new ArrayList<>();
        List<Baleia> baleia = new ArrayList<>();
        List<Cavalo> cavalo = new ArrayList<>();

        UsoGenerics genericos = new UsoGenerics();
        for(int i=0;i<3;i++){
            arara.add(new Arara());
            animal.add(new Animal());
            baleia.add(new Baleia());
            cavalo.add(new Cavalo());
        }

        genericos.verAnimais(animal);
        genericos.verAnimais(cavalo);
        genericos.verAnimais(baleia);
        genericos.verAnimais(arara);
        
    }
    
}
