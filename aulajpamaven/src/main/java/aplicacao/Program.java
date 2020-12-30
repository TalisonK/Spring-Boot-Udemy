package aplicacao;

import aulajpa.Pessoa;

public class Program {
    public static void main(String[] args) {
        JPAManager jpa = new JPAManager();

        Pessoa p1 = new Pessoa(null, "joao", "joao321@gmail.com");
        Pessoa p2 = new Pessoa(null, "kenin", "kenin@gmail.com");
        Pessoa p3 = new Pessoa(null, "ze", "ze@gmail.com");


        jpa.addPessoa(p1);
        jpa.addPessoa(p1);
        jpa.addPessoa(p2);
        jpa.addPessoa(p3);

        System.out.println("pronto!");

    }
}
