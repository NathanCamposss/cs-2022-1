

public class questao3 {
    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        usuario.login = "NathanCampos";
        usuario.senha = "9A!!a/!/!";
        boolean validSenha = Validador.validaSenha(usuario);
        boolean validLogin = Validador.validaLogin(usuario);
        System.out.println("O login "+usuario.login+" possui validade: "+validLogin);
        System.out.println("A senha "+usuario.senha+" possui validade: "+validSenha);
        
    }
}

class Usuario {
    String login;
    String senha;

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}

class Validador {
    public static boolean validaLogin(Usuario usuario){

        String login = usuario.getLogin();

        return login.matches(".{5,30}");

    }

    public static boolean validaSenha(Usuario usuario){

        String senha = usuario.getSenha();

        return senha.matches("^(?=.{8,12}$)(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$");
    }
}
