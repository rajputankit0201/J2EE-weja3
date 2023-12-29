package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.AadharCard;
import dto.Person;

public class PersonDAO2 {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		
		openConnection();
		entityTransaction.begin();
		
		Person person = entityManager.find(Person.class, 2);
		entityManager.remove(person);
		
		AadharCard aadharCard= entityManager.find(AadharCard.class,2);
		entityManager.remove(aadharCard);
		
		entityTransaction.commit();
		closeConnection();
	}

	private static void closeConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("person");
		entityManager= entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		
	}

	private static void openConnection() {
		if (entityManagerFactory !=null) {
			entityManagerFactory.close();
		}
		if (entityManager !=null) {
			entityManager.close();
		}
		if (entityTransaction != null) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
	}
}
