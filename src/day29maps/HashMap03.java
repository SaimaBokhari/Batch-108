package day29maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap03 {
    public static void main(String[] args) {

        //Example 1: Type code to print the number of occurrences of words in a sentence
        //"I like to move it, move it. Do you like it?"  => I=1, like=2, to=1, move=2, it=3, do=1, you=1
        // This structure of the output I=1, should be a hint for you that you need to use maps to solve this question

        String sentence = "I like to move it, move it. Do you like it?";

        // remove punctuation marks
        sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);

        // get the words from the sentence by using split()... split method returns Arrays so we create Array container to store the output
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words)); // [I, like, to, move, it, move, it, Do, you, like, it]

        HashMap<String, Integer> occurrenceMap = new HashMap<>();
        // For Maps, Java uses {}, for Collections, Java uses []

        for(String w: words){
            Integer numOfOccurrence =  occurrenceMap.get(w);
            if(numOfOccurrence == null){
                occurrenceMap.put(w,1);
            }else{
                occurrenceMap.put(w, numOfOccurrence+1);
            }
        }
        System.out.println(occurrenceMap);

        //Example 2: Type code to print the number of occurrences of letters in a sentence


        // replace all spaces

        sentence = sentence.replaceAll(" ", "");
        System.out.println(sentence);

        // get the letters
        String[] letters = sentence.split("");
        System.out.println(Arrays.toString(letters));

        // Create Map

        HashMap<String, Integer> occurrenceOfLetters = new HashMap<>();


        // use for-each loop

        for(String w: letters){
            Integer numOfLetters = occurrenceOfLetters.get(w);

            if(numOfLetters==null){
                occurrenceOfLetters.put(w, 1);
            }else {
                occurrenceOfLetters.put(w, numOfLetters+1);
            }
        }
        System.out.println(occurrenceOfLetters);














    }

}
