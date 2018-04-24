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
public class Person {
    // declare instance variables/ data members

    private String name; // to store the name
    private int age; // to store the age
    private boolean enjoysReading; // to store whether that Person enjoys reading or not (true means yes, false means no)

    public boolean getEnjoysReading() {
        return enjoysReading;
    }

    // declare constructors
    /*
         constructors: during a program's execution, a constructor is used to initialize the object's instance variables when that object is created
     */

 /*
         declare multiple constructors -- in OOP, when we declare multiple constructors in the same class we *overload constructors*
         the signature of the overloaded constructors must be different i.e. we cannot have 2 constructors with the same signature (please see the examples below)
     */
    // declare a constructor with 3 parameters
    public Person(String myName, boolean reads, int myAge) {
        // initialize the instance variables with the values provided by the user of this class (the user of this class is another class -- i.e. the class where we create the objects of type Person)

        // initialize the instance variable name with the value of the parameter myName
        name = myName;
        // initialize the instance variable enjoysReading with the value of the parameter reads
        enjoysReading = reads;
        // initialize the instance variable age with the value of the parameter myAge
        age = myAge;
    }

    /*
     declare the constructor without parameters
     this constructor is known as the default constructor or the no-arguments constructor
     if we do not declare ANY constructor in our class, the java compiler generates and inserts in the .class file the default constructor  (i.e. the constructor without parameters)
     */
    public Person() {
        // the default constructor initializes all the instance variables  with their default values
        // in our example, the default values are null for name, 0 for age and false for enjoysReading
    }

    // declare a constructor with one parameter of type String
    public Person(String name) {
        // initialize the instance variable name, that is this.name, with the value of the parameter name
        this.name = name;
    }

    // declare a constructor with 2 parameters
    public Person(String name, boolean eR) {
        // initialize the instance variable name (i.e. this.name) with the value of the parameter name
        this.name = name;
        // initialize the instance variable enjoysReading with the value of the parameter eR
        enjoysReading = eR;
    }

    // declare another constructor with 2 parameters
    /*
     note that the constructor below does the same initializations as the above constructor (i.e. initializes the name and enjoysReading instance variables with some values)
     therefore, either the following constructor or the above constructor is needed in this class but not both as they perform the very same operations

     the following constructor has a different signature namely, Person(boolean eR, String name) whereas the above is Person(String name, boolean eR) -- note the different order of the parameters data types

     when we declare multiple constructors in a class the constructors must have different signatures otherwise the compiler will generate a compilation error (i.e. constructor is already defined error)

     in general, when we overload constructors the signature must differ i.e. the parameters list must either have
     different number of parameters, or if the parameter lists are of the same size, then across two constructors the parameters must have different data types and different order of the parameters data types
     */
    public Person(boolean eR, String name) {
        // initialize the instance variable name (i.e. this.name) with the value of the parameter name
        this.name = name;
        // initialize the instance variable enjoysReading (i.e. this.enjoysReading) with the value of the parameter eR
        this.enjoysReading = eR;
    }

    // declare a display method -- this is added just to display the content of the instance variables immediately after an object creation using one of the available constructors
    public void displayMe() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(enjoysReading);
        System.out.println();
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge() {
        System.out.println("Age: " + age);
    }

    public void displayDoesRead() {
        System.out.println("reads: " + enjoysReading);
    }

    public void displayAllDetails() {
        displayName();
        displayAge();
        displayDoesRead();
    }

}
