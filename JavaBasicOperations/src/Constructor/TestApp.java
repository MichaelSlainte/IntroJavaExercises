/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author engmi
 */
import java.util.Scanner;
public class TestApp{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter age: ");
	int in = sc.nextInt();

	System.out.println("Name ");
	String in1 = sc.next();

	System.out.println(" ");


	Test myObj = new Test();

	myObj.displayMe();

	Test myObj1 = new Test(17);
	myObj1.displayMe();

	Test myObj2 = new Test("Michael");
	myObj2.displayMe();

	Test myObj3 = new Test("Michael", 28);
	myObj3.displayMe();

	Test myObj4 = new Test(in1,in);
	myObj4.displayMe();

	}
}
