package apicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class ProgramaConsulta {

	public static void main(String[] args) {
	

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);
		em.close();
		emf.close();

	}

}
