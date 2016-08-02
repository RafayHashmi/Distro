package com.company;

import com.sun.glass.ui.Menu;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RafayHashmi on 17/07/2016.
 */
public class Game {

    int count;
    int chosen;
    int input;
    int credit;
    Scanner inp = new Scanner(System.in);


    Game ()
    {
        count = 0;
        chosen = 0;
        input = 0;
        credit = 3;

    }

    void menu()
    {
        System.out.println("SELECT FROM MENU \n");
        System.out.println("1) PLAY TRAIL \n");
        System.out.println("2) ADD CREDIT \n");
        System.out.println("3) EXIT \n");
        switch(inp.next())
        {
            case "1" :
            {
                playonce();
            }
            case "2" :
            {
                addcredit();
            }
            case  "3":
            {
                System.exit(0);
            }
            default :
            {
                System.out.println("INVALID INPUT ! \n ENTER FROM MENU \n ");
                menu();
            }
        }

    }

    void playonce()
    {
        if(credit > 0) {
            Random toguess = new Random();
            this.chosen = toguess.nextInt(10);
            System.out.println("NUMBER HAS BEEN CHOSEN \n NUMBER IS " + chosen + "\n");
            System.out.println("GUESS THE NUMBER FROM 1 - 10 \n");
            this.input = inp.nextInt();
            if (input != chosen) {
                System.out.println("INVALID INPUT \n TRY AGAIN ! ");
                credit--;
                playonce();
            }
            else {
                System.out.println("CORRECT INPUT ! \n YOU WIN \n");
                credit--;
                menu();
            }
        }
        else{
            System.out.println("CREDIT INSUFFICIENT \n" + " ADD CREDIT? (Y / y) OR (N / n) \n");
            if(inp.next() == "Y" || inp.next() == "y")
            {
            addcredit();}
            else {
                menu();
            }

        }
    }

    void addcredit() {
        System.out.println("ENTER CREDIT TO ADD (LIMIT 1-10)\n");
        this.credit = inp.nextInt();
        if(credit < 1 || credit > 10)
        {
            System.out.println("CREDIT ADDED \n CREDIT = " + credit);
            menu();
        }
        else{
            System.out.println("LIMIT ERROR : 1 - 10 \n");
            menu();
        }
    }
}
