package apicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class ProgramaSalvar {

	public static void main(String[] args) {
	
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres" , "jaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria" , "anamaria@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().begin();
		em.getTransaction().commit();
		System.out.println("Cadastrado Com sucesso");
		

	}

}
