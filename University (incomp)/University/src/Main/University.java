package Main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by MT-2016 on 6/12/2016.
 */
public class University {

    private ArrayList<Human> TSADV = new ArrayList<>();
    private ArrayList<Human> TTADV = new ArrayList<>();
    
    //private Human[] TS  =  new Student[10];
    //private Human[] TT  = new Teacher[10];

    private int count;
    public Scanner inp = new Scanner(System.in);
    
    
    public University(int count) {
        this.count = count;
        System.out.println("WELCOME TO UNIVERSITY\n");
    }
    
   public boolean menu ()
   {
        System.out.println("SELECT FROM OPTION\n");
        System.out.println("1 - ADD\n");
        System.out.println("2 - REMOVE\n");
        System.out.println("3 - UPDATE\n");
        System.out.println("4 - SEARCH\n");
        
        switch(inp.next())
        {
            case "1":
            {
                System.out.println("SELECT FROM OPTION\n");
                System.out.println("A - Student\n");
                System.out.println("B - TEACHER\n");
                switch(inp.next())
                {
                    case "A":
                    {
                        Human h = new Human("Name", "Gender", 50);
                        Student s = new Student(h, "MCS");
                        insertStd(s);
                        System.out.println("STUDENT RECORD INSERTED\n");
                        break;
                    }
                    case "B":
                    {
                        Teacher t = new Teacher("Name", "Gender", 50, "Phd");
                        insertTch(t);
                        System.out.println("TEACHER RECORD INSERTED\n");
                        break;
                    }
                    default:
                    {
                        System.out.println("ENTER VALID OPTION\n"); 
                        break;
                    }
                }
            break;
            }
            
            case "2":
            {
                System.out.println("SELECT FROM OPTION\n");
                System.out.println("A - Student\n");
                System.out.println("B - TEACHER\n");
                switch(inp.next())
                {
                    case "A":
                    {
                        System.out.println("ENTER STUDENT NAME\n");
                        removeStd(inp.next());
                        break;
                    }
                    case "B":
                    {
                        System.out.println("ENTER TEACHER NAME\n");
                        removeTch(inp.next());
                        break;
                    }
                    default:
                    {
                        System.out.println("ENTER VALID OPTION\n");
                        break;
                    }
                }
            break;
            }
                
            case "3":
            {
            
                break;
            }
            
            case "4":
            {
                System.out.println("SELECT FROM OPTION\n");
                System.out.println("A - Student\n");
                System.out.println("B - TEACHER\n");
                switch(inp.next())
                {
                    case "A":
                    {
                        System.out.println("ENTER STUDENT NAME\n");
                        searchStd(inp.next());
                        break;
                    }
                    case "B":
                    {
                        System.out.println("ENTER TEACHER NAME\n");
                        searchTch(inp.next());
                        break;
                    }
                    default:
                    {
                        System.out.println("ENTER VALID OPTION\n");
                        break;
                    }
                }
                break;
            }
                
            default:
            {
                System.out.println("ENTER VALID OPTION\n");
                break;
            }
        }
   return true;
   }
    

    public void insertStd(Human h)
    {
        //TS[count++] = h;
        TSADV.add(h);
    }
    public void insertTch(Human h)
    {
        //TT[count++] = h;
        TSADV.add(h);
    }

    private void removeStd(String Name) {
        int run = 0;
        while(run < TSADV.size())
        {
            if(TSADV.get(run).getName().equals(Name))
            {
                System.out.println(TSADV.get(run).getName() + " REMOVED\n");
                TSADV.remove(run);
                break;
            }
            run++;
        }
        System.out.println("NOT FOUND\n");
    }

    private void removeTch(String Name) {
        int run = 0;
        while(run < TTADV.size())
        {
            if(TTADV.get(run).getName().equals(Name))
            {
                System.out.println(TTADV.get(run).getName() + " REMOVED\n");
                TTADV.remove(run);
                break;
            }
            run++;
        }
        System.out.println("NOT FOUND\n");
    }

    private void searchStd(String next) {
        
    }

    private void searchTch(String next) {
        
    }
    
    

}

