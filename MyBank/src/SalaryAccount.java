public class SalaryAccount extends BankAccount
{
    double creditLimit;

    @Override
    void setOwner(Customer owner)
    {
        if(Status.VIP.equals(true) || Status.ADULT.equals(true))
        {
            this.owner = owner;

        }
        else
        {
            System.out.println("A mistake occoured when trying to transfer ownership, check to see if you meet the requirements for this account");
        }
    }

    @Override
    boolean withdraw(double amount)
    {
        if(getBalance() + creditLimit >= amount)
        {
            if(amount > 15000)
            {
                System.out.println("you can only withdraw 15000 a day");
                return false;
            }
            balance = balance - amount;
            return true;
        }
        return false;
    }
}
