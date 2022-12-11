package day27exceptionscollections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        readFileLineByLine();
    }

    public static void readFileLineByLine(){

        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/Ahmed/IdeaProjects/Batch 108/src/day26exceptions/TextFile.txt"));
            String line = reader.readLine();

            while(line!=null){
                System.out.println(line);
                line = reader.readLine();
            }
        }catch(FileNotFoundException e){
           // e.printStackTrace();
            System.out.println("There's is an issue about the path or file:" + e.getMessage());
        }catch(IOException e){
            e.printStackTrace();
        }



    }
}
