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
public class RainfallAvgMaxMin {
    //data member

    int weeks;
    int days;
    double max;
    double min;
    double av;
    double arr[][];

    //construtor
    public RainfallAvgMaxMin() {
        this.arr = arr;
        this.weeks = weeks;
        this.days = days;
        this.av = av;
        this.max = max;
        this.min = min;
    }

    //setter
    public void setArr(double arr[][]) {
        this.arr = arr;
    }

    //compute
    public void compute() {
        double sum = 0;
        int counter = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                sum = sum + arr[row][col];
                counter++;
            }
        }
        av = sum / counter;

    }

    public void computeMax() {
        max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (max < arr[row][col]) {
                    max = arr[row][col];
                }
            }
        }
    }

    public void computeMin() {
        min = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (min > arr[row][col]) {
                    min = arr[row][col];
                }
            }
        }
    }
    //getter

    public double getAv() {
        return av;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }
}
