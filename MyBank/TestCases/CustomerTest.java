import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest
{

    @Test
    void setName()
    {
        Customer customer = new Customer();
        customer.setName("Karsten");
        assertEquals("Karsten", customer.getName());
        customer.setName("karsten");
        assertEquals("", customer.getName());
        customer.setName("Karst3n");
        assertEquals("", customer.getName());
        customer.setName(null);
        assertEquals("", customer.getName());
        customer.setName("//&");
        assertEquals("", customer.getName());

    }
    @Test
    void setChildStatus()
    {
        Customer customer = new Customer();
        customer.setStatus(Status.CHILD);
        assertEquals(customer.getStatus(), Status.CHILD);
    }
    @Test
    void setAdultStatus()
    {
        Customer customer = new Customer();
        customer.setStatus(Status.ADULT);
        assertEquals(customer.getStatus(), Status.ADULT);
    }
    @Test
    void setVIPStatus()
    {
        Customer customer = new Customer();
        customer.setStatus(Status.VIP);
        assertEquals(customer.getStatus(), Status.VIP);
    }
    @Test
    void addChildAccount()
    {
        Customer childCust = new Customer();
        PenguinAccount peng = new PenguinAccount();
        childCust.addAccount(peng);
        assertEquals(peng.owner, childCust);
    }

    @Test
    void addAdultAccount()
    {
        Customer adultCust = new Customer();
        SalaryAccount sal = new SalaryAccount();
        adultCust.addAccount(sal);
        assertEquals(sal.owner, adultCust);
    }

    @Test
    void addVipAccount()
    {
        Customer vipCust = new Customer();
        PremiumAccount sal = new PremiumAccount();
        vipCust.addAccount(sal);
        assertEquals(sal.owner, vipCust);
    }

    @Test
    void removeAccount()
    {
        Customer cust = new Customer();
        SalaryAccount sal = new SalaryAccount();
        cust.addAccount(sal);
        cust.removeAccount(sal);
        assertEquals(sal.owner, "");
    }

}
