package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.AadharCard;
import dto.Person;

public class PersonDAO {

		
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	
	public static void main(String[] args) {
		
		OpenConnection();
		entityTransaction.begin();
		
		AadharCard aadharCard= new AadharCard();
		aadharCard.setAadharNumber(987654612);
		entityManager.persist(aadharCard);
		
		
		Person person = new Person();
		person.setName("Ankit");
		person.setEmail("ankit@gmail.com");
		person.setAadharCard(aadharCard);
		entityManager.persist(person);
		
		entityTransaction.commit();
		closeConnection();
	}


	private static void OpenConnection() {
		entityManagerFactory= Persistence.createEntityManagerFactory("person");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
	}


	private static void closeConnection() {
		
		if (entityManagerFactory !=null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityTransaction !=null) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
	}
}
