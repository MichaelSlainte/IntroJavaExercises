/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loop;

/**
 *
 * @author engmi
 */
import java.util.Scanner;

public class GuessNumberApp {

    public static void main(String args[]) {
        int number;
        Scanner in = new Scanner(System.in);

        GuessNumber myGuess = new GuessNumber();

        String n = "yes";

        //initialize
        int i = 0;
        while (n.equals("yes")) {
            //prompt the user
            System.out.println("Enter number [1,20]");
            number = in.nextInt();
            myGuess.setNumber(number);

            myGuess.compare();
            String m = myGuess.getMessage();
            System.out.println(m);

            System.out.println("Would you like to play again?Yes/No");
            n = in.next();
            n = n.toLowerCase();

            if (m.equals("Congrats")) {
                break;

            }
            i = i + 1;

        }

    }
}
