package principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Ativo;

public class principal {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bd-sga");
		EntityManager em = emf.createEntityManager();
		Ativo a = new Ativo("BBSE3", 25000, 98.25);
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		System.out.println("Pronto");
		em.close();
		emf.close();
	}

}
