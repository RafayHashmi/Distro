
package bankdemo;

public class CheckingAmount {
    
    private double balance = 0;
    private int number = 0;
    
    CheckingAmount( int number )
    {
        this.number = number;
    }
    
    public void deposit ( double amount )
    {
        balance = balance + amount ;
    }
    
    public void withdraw( double amount ) throws InsufficientFundsException
    {
        if(amount <= balance)
        {balance = balance - amount;}
        else
        {
            double needs = amount - balance;
            throw new InsufficientFundsException( needs );
        } 
    }
    
    public double getbalance ()
    {
        return balance ;
    }
    
     public int getnumber ()
    {
        return number ;
    }
    
    
    
}
