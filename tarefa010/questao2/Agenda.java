import java.util.ArrayList;

public class Agenda {

    ArrayList<Contato> lista = new ArrayList<Contato>();

    public void addContato(Contato contato){
        lista.add(contato);
    }

    public Contato procurarContato(String procura){
        
        for (Contato contato: this.lista){
            if(contato.nome.equals(procura) || contato.email.equals(procura)){
                return contato;
            }
        }
        return null;

    }

    public void apagarContato(String procura){
        
        for (Contato contato: this.lista){
            if(contato.nome.equals(procura) || contato.email.equals(procura)){
                this.lista.remove(contato);
                break;
            }
        }
        

    }

    public void listarContato(){
        for(Contato contats: this.lista){
            System.out.println(contats);
        }
    }
    
}

class test {
    public static void main(String[] args) {

        Agenda genda= new Agenda();
        Contato cont = new Contato();
        cont.email="123@gmail.com";
        cont.nome="nome";
        genda.addContato(cont);
        cont = new Contato();
        cont.email="321@gmail.com";
        cont.nome="321";
        genda.addContato(cont);
        cont = new Contato();
        cont.email="pedrim@gmail.com";
        cont.nome="pedro";
        genda.addContato(cont);

        genda.listarContato();
        System.out.println("Contato procurado:\n"+genda.procurarContato("321"));
        genda.apagarContato("321");
        System.out.println("Após apagar um contato a lista ficou: \n");
        genda.listarContato();
        
    }
}
