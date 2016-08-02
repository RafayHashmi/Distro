
package newpackage;

public class NewClass implements interface1 {
    
    @Override
    public void display() {
        System.out.println("now using abstract class abstract method");
    }
      
   public static void main(String[] args) {
       
       NewClass obj = new NewClass();
       
       obj.display();
       
       System.out.println( interface1.accno );
        
   }
}
