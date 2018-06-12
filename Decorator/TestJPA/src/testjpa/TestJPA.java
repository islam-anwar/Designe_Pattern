/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjpa;

import entity.Customer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

/**
 *
 * @author JEDiver
 */
public class TestJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("mohsenPU2");
        EntityManager manager = factory.createEntityManager();
        Customer customer = new Customer();
//        customer.setCustId(12);
        customer.setAge(22);
        customer.setName("Mohsen");
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        manager.persist(customer);
        transaction.commit();
        System.out.println("Finished");
    }
    
}
