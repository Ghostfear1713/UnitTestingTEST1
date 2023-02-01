public abstract class BankAccount
{
    protected double balance;
    protected Customer owner;

    abstract void setOwner(Customer owner);
    abstract boolean withdraw(double amount);
    int getId()
    {
        int ownerId = owner.getId();
        return ownerId;

    }
    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;
        }
        else {
            System.out.println("use withdraw if you want to take money out of your account");
        }
    }

    public double getBalance()
    {
        return this.balance;
    }
    public Customer getOwner()
    {
        return this.owner;
    }

}
