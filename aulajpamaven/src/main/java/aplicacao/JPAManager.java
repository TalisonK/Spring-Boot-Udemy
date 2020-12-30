package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import aulajpa.Pessoa;

public class JPAManager {

	EntityManagerFactory emf;
	EntityManager em;

	public JPAManager() {
		emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		em = emf.createEntityManager();
	}

	public void addPessoa(Pessoa p){
		em.getTransaction().begin();
		if(!em.contains(p)){
			em.persist(p);
			System.out.println("Usuario " + p.getNome() + " adicionado com sucesso");
		}else{
			System.out.println("O banco de dados já possui o usuario " + p.getNome());
		}
		em.getTransaction().commit();
	}

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "joao", "joao321@gmail.com");
		Pessoa p2 = new Pessoa(null, "kenin", "kenin@gmail.com");
		Pessoa p3 = new Pessoa(null, "ze", "ze@gmail.com");


		System.out.println("pronto");

	}

}
