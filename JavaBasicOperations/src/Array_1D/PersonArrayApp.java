/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_1D;

/**
 *
 * @author engmi
 */
import java.util.Scanner;

public class PersonArrayApp {

    public static void main(String args[]) {

        int n; //number of Person Objects
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.println("How many records? ");
        n = sc1.nextInt();

        //declare an array of Person
        Person[] people;
        //create the array of Person
        people = new Person[n];

        for (int i = 0; i < people.length; i++) {
            System.out.println("name: ");
            String name = sc.nextLine();
            System.out.println("Reads (true/false) ? ");
            boolean reads = sc1.nextBoolean();

            Person p = new Person(name, reads);

            people[i] = p; // Store Person Object

        }

        //processing output
        Person p;
        for (int i = 0; i < people.length; i++) {
            p = people[i]; //retrive the object
            boolean doesRead = p.getEnjoysReading();
            if (doesRead) {
                p.displayAllDetails();
            }
        }
    }
}
