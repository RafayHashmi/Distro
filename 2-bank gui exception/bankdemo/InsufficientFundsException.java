
package bankdemo;

class InsufficientFundsException extends Exception {

    private double needs;
    
    public InsufficientFundsException( double needs ) {
        this.needs = needs;
    }
    
    public double getneeds()
    {
    return needs;
    }
    
    
}
