/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_2D;

/**
 *
 * @author engmi
 */
import java.util.Scanner;

public class RainfallApp {

    public static void main(String args[]) {
        int weeks = 2;
        int days = 2;
        double arr[][] = new double[weeks][days];

        Scanner in = new Scanner(System.in);

        RainfallAvgMaxMin myObj = new RainfallAvgMaxMin();

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println("Enter the Rainfall av for Week" + (row + 1) + " and Day" + (col + 1));
                arr[row][col] = in.nextDouble();
            }
        }
        //setter
        myObj.setArr(arr);
        //process
        myObj.compute();

        myObj.computeMax();

        myObj.computeMin();

        //getter
        System.out.println("The Avg is = " + myObj.getAv());
        System.out.println("The Max value is = " + myObj.getMax());
        System.out.println("The Min value is = " + myObj.getMin());
    }
}
