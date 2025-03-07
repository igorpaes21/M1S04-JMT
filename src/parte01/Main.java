package parte01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        //Instanciando-Criando objetos
        User user01 = new User();
        User user02 = new User();
        // User user03 = new User("Lara" );

        //Inserindo informações nos objetos
        user01.setName("Igor Sena");
        user01.setEmail("irsp2121@gmail.com");
        user01.resetPassword("12345678");

        user02.setName("Angra Arruda");
        user02.setEmail("angra.alexandre@gmail.com");
        user02.resetPassword("87654321");

        users.add(user01);
        users.add(user02);

        System.out.println(user01.details());
        System.out.println(user02.details());

        System.out.println("-----TELA DE LOGIN------");
        System.out.print("Email:");
        String email = scan.next();
        System.out.print("Password:");
        String password = scan.next();

        boolean flaglogin = false;

        for (User user : users) {
            if (user.login(email, password)) {
                flaglogin = true;
                break;
            }
        }

        System.out.println(flaglogin ? "Seja bem vindo!" : "Email ou senha incorretos!");



        while (true) {
            System.out.println("RESET DE SENHA:");
            if (user01.resetPassword(scan.next())) {
                System.out.println("Senha alterda com sucesso");
            } else {
                System.out.println("A senha não pode ser uma utilizada anteriormente");
                break;
            }
        }

    }

}
