/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.transoft.crm.ejb;

import ch.transoft.crm.entity.Customer;
import ch.transoft.crm.service.CustomerServiceImpl;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.Session;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Christopher Lam
 */
@Stateless
@LocalBean
public class DefaultCRMFacadeBean
{
   @PersistenceContext
   private EntityManager entityManager;
   
   
    public CustomerServiceImpl getCustomerService() {
    return new CustomerServiceImpl(entityManager);
  }

   
  public EntityManager getEntityManager() {
    return entityManager;
  }

          
    
}
