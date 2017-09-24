package ch.transoft.crm.beans;

import ch.transoft.crm.ejb.DefaultCRMFacadeBean;
import ch.transoft.crm.entity.Customer;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Dell
 */

@ManagedBean(name = "customer")
@SessionScoped
public class CustomerMBean {
    
     @EJB
    private DefaultCRMFacadeBean customerFacadeBean;
     
    private List<Customer> customers;
    
    
    public CustomerMBean()
    {
    }

    /**
     * Returns list of customer objects to be displayed in the data table
     * @return
     */
    public List<Customer> getCustomers()
    {
        customers =  customerFacadeBean.getCustomerService().getAllCustomer();
        return customers;
    }

    
    
    
    
    
}
