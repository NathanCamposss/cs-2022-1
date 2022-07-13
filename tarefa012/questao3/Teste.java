package questao3;

public class Teste {
    public static void main(String[] args) {
        Login login = new Login();
        login.setUsuario("u");
        login.setSenha("1");

        System.out.println(login.fazerLogin("u", "1"));
        System.out.println(login.fazerLogin("us", "12"));
    }
    
}
