package apicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class ProgramaAtualiza {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		
		Pessoa pessoa = em.find(Pessoa.class,3);
		em.getTransaction().begin();
		pessoa.setNome("Kauã Mendes");
		pessoa.setEmail("kauamendes@gmail.com");
		em.getTransaction().commit();
		
		System.out.println("Pessoa Atualizada com sucesso");

	}

}
