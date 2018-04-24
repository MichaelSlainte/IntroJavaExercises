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
public class Theatre2 {
    //data member

    private String day, message;
    private int age;

    //Constructor
    public Theatre2() {
        this.day = day;
        this.age = age;
        this.message = message;
    }

    //setter
    public void setDay(String day) {
        this.day = day;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //compute
    public void compute() {
        String dayL = day.toLowerCase();
        if (dayL.equals("monday") || dayL.equals("tuesday") || dayL.equals("wednesday") || dayL.equals("thursday")) {
            if (age >= 5 && age <= 15) {
                message = "15 Euros";
            } else if (age >= 16 && age <= 65) {
                message = "20 Euros";
            } else {
                message = "FREE!!!";
            }

        } else if (dayL.equals("friday") || dayL.equals("saturday") || dayL.equals("sunday")) {
            if (age >= 5 && age <= 15) {
                message = "20 Euros";
            } else if (age >= 16 && age <= 65) {
                message = "30 Euros";
            } else {
                message = "5!!!";
            }
        } else {
            message = "Unknown Day";
        }
    }

    //getters
    public String getMessage() {
        return message;
    }

    public int getAge() {
        return age;
    }
}
