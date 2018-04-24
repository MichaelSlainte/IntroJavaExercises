/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringBuffers;

/**
 *
 * @author engmi
 */
import java.util.Scanner;

public class PigLatinApp {

    public static void main(String args[]) {
        String word, translatedWord;

        //input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter word");
        word = in.next();

        PigLatin myObj = new PigLatin();
        myObj.setWord(word);

        //process
        myObj.translate();

        //output
        System.out.println("Translated word is: " + myObj.getTranslatedWord());

    }
}
