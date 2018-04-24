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
/*Problem: Simple PigLatin
PigLatin is a secret language used by children whereby the
?rst letter of a word is moved to the end of the word and
the letters “ay” are added to the end.
You have been asked to develop an application that accepts
a word from the user, translates the word to PigLatin and
outputs the translated word.
The application should make use of instantiable classes and
the instantiable class should be named PigLatin.
For example, if the user enters happy PigLatin would transtate this word to
appyhay*/
public class PigLatin {
//data member

    private String word, translatedWord;

//constructor
    public PigLatin() {
    }

//setter
    public void setWord(String word) {
        this.word = word;
    }

//computing
    public void translate() {
        int len = word.length();
        StringBuffer st = new StringBuffer();

        for (int i = 1; i < len; i++) {
            char c = word.charAt(i);
            st.append(c);
        }

        char firWord = word.charAt(0);
        st.append(firWord);

        st.append("ay");

        translatedWord = st.toString();

    }

//getter
    public String getTranslatedWord() {
        return translatedWord;
    }

}
