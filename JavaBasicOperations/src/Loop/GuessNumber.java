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
import java.util.Random;

public class GuessNumber {

    private int number;
    private int secret;
    private String message;

    public String getMessage() {
        return message;
    }

    public int getSecret() {
        return secret;
    }

    public GuessNumber() {
        Random r = new Random();
        secret = r.nextInt(20);//[0.20)
        secret = secret + 1; //[1,21)
    }

    public void setNumber(int value) {
        number = value;
    }

    public void compare() {

        if (number == secret) {
            message = "Congrats";
        } else if (number > secret) {
            message = "You guessed too high ";
        } else {
            message = "You guessed to low ";
        }
    }
}
