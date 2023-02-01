public class PenguinAccount extends BankAccount
{


    @Override
    void setOwner(Customer owner)
    {
        if(Status.CHILD.equals(true))
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
        if(getBalance() >= amount)
        {
            if(amount > 1000)
            {
                System.out.println("as a child you may only withdraw 1000 a day");
                return false;
            }
            balance = balance - amount;
            return true;
        }
        System.out.println("Your balance is to low");
        return false;
    }
}
