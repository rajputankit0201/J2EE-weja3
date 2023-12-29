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

        // Find the Person entity by its ID
        Person person = entityManager.find(Person.class, 2);

        if (person != null) {
            // Remove the Person entity
            entityManager.remove(person);

            // Access and remove the associated AadharCard entity
            AadharCard aadharCard = person.getAadharCard();
            if (aadharCard != null) {
                entityManager.remove(aadharCard);
            }
        } else {
            System.out.println("Person entity with ID 1 not found.");
        }

        entityTransaction.commit();
        closeConnection();
    }

    private static void openConnection() {
        entityManagerFactory = Persistence.createEntityManagerFactory("person");
        entityManager = entityManagerFactory.createEntityManager();
        entityTransaction = entityManager.getTransaction();
    }

    private static void closeConnection() {
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
        if (entityManager != null) {
            entityManager.close();
        }
        if (entityTransaction != null) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
        }
    }
}
