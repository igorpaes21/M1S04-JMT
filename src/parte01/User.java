package parte01;

import java.util.ArrayList;

public class User {

    //Atributos
    private String name;
    private String email;
    private String password;
    private ArrayList<String> storagePassword = new ArrayList<>();

    //Construtor Padrão
    User() {
    }

    //Construtor Patrametrizado
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(String name) {
        this.name = name;
    }

    //Métodos getters e setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public boolean resetPassword(String password) {

        if (!validPassword(password)) {
            this.password = password;
            storagePassword.add(this.password);
            return true;
        }
        return false;
    }

    //Método para validar se a senha foi utilizada anteriormente
    private boolean validPassword(String password) {
        boolean flag = false;
        for (String pass : storagePassword) {
            if (pass.equals(password)) {
                flag = true;
            }
            return flag;
        }
        return flag;
    }

    //Métodos
    public String details() {
        return String.format("------ INFORMAÇÕES DO USUÁRIO-----\nNome:%s\nEmail:%s\nPassword:%s", name, email, password);
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);

    }
}
