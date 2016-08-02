
package bankdemo;

public class BankDemo {
    
    

    public static void main(String[] args) {
        try {
            CheckingAmount person = new CheckingAmount(89787879);
            
            System.out.println(" try to depositing $500");
            person.deposit(500);
            System.out.println("deposited");
            
            System.out.println(" try to withdrawing $100");
            person.withdraw(100);
            System.out.println("withdrawn");
                    
            
             System.out.println("try to withdrawing $500");
             person.withdraw(500);
             System.out.println("withdrawn");
            
             System.out.println("system compromised by HACKER");
             person.withdraw(10000);
        }
        catch (InsufficientFundsException e) {
            System.out.println("You need " + e.getneeds() + " more money . . . " );
        }
        
        
    
    }
}
