/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SelectionStatements;

/**
 *
 * @author engmi
 */
import java.util.Scanner;

public class Theatre2App {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Theatre2 myObj = new Theatre2();
        String day, message;
        int age;
//input
        System.out.println("Enter a day! ");
        day = in.next();

        System.out.println("Enter your age! ");
        age = in.nextInt();

//process
        myObj.setDay(day);

        myObj.setAge(age);

        myObj.compute();

        message = myObj.getMessage();
        System.out.println("Price is " + message);

    }
}
