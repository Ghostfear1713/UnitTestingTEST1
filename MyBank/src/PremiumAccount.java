public class PremiumAccount extends BankAccount
{
    @Override
    void setOwner(Customer owner)
    {
        if(Status.VIP.equals(true))
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
        balance = balance - amount;
        return true;
    }
}
