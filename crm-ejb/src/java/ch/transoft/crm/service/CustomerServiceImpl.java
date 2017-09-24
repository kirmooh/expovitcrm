/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.transoft.crm.service;


import ch.transoft.crm.entity.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Dell
 */
public class CustomerServiceImpl {
    
     private EntityManager entityManager;
     
     public CustomerServiceImpl(EntityManager entityManager){
         
         this.entityManager = entityManager;
         
     }
     
       /**
     * Returns a list of Customer objects in the database
     * @return List<Customer>
     */
    public List<Customer> getAllCustomer()
    {
        Query query = entityManager.createNamedQuery("Customer.findAll");
        return query.getResultList();
    }

    
}
