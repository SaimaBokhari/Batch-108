package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Review01 {
    public static void main(String[] args) {

        /*
        Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end
         //        [2, 3, 12, 0, 0, 0]
         */

       int s[] = {0, 2, 3, 0, 12, 0};
       int t[] = new int[s.length];

       int idx = 0;

       for(int i=0; i<s.length; i++){
           if(s[i] !=0){
               t[idx] = s[i];
               idx++;
           }
       }
        System.out.println(Arrays.toString(t));

               /*
        Example 2: Type code to check if a specific element exists in an array or not.
        int crr[] = {-12, 23, 5}; check if 23 exists in the array or not.
         */

        int crr[] = {-12, 23, 5};
        int counter = 0;

        for(int w: crr){
            if(w==23){
                counter++;
            }
        }
        if(counter>0) {
            System.out.println("It exists");
        }else{
            System.out.println("it doesn't exist");
        }


        /*
        Example 1: 09/20/2022 is given,
        print the date like "Month:09    Day:20     Year:2022"
         */

        String date = "09/20/2022";

        String date1[] = date.split("/");
        System.out.println(Arrays.toString(date1));
        System.out.println("Month:" + date1[0]);
        System.out.println("day:" + date1[1]);
        System.out.println("year:" + date1[2]);

        /*
        Example 2:Get string from user and type code to find the number of words in the String.
                "I like to move it, move it" ==> 7
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence plz");
        String sentence = input.nextLine();

        String sentence1[] = sentence.split(" ");
        System.out.println(Arrays.toString(sentence1));

        System.out.println("The number of words:" + sentence1.length);

        /*
        Example 3: Count the number of words starts with "a" in the String.
        Use data from above example.
         */
        int counter1 = 0;

        for(String w: sentence1){
            if (w.startsWith("a") || (w.startsWith("A"))){
                counter1++;
            }
        }
        System.out.println("Words staring with a:" + counter1);

        /*
        Example 4: Type code to find the longest word in the sentence

         */

        String longest = "I am a citizen of a global village.";

        String longest1[] = longest.split(" ");
        System.out.println(Arrays.toString(longest1));

        Arrays.sort(longest1, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(longest1));
        System.out.println(longest1[longest1.length-1]);









    }
}
