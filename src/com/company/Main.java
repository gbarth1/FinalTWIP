package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
	    String fileName = "rawDataU6.txt";
        String line = null;
        try{
            FileReader filereader= new FileReader(fileName);
            BufferedReader bufferedreader = new BufferedReader(filereader);
            while((line=bufferedreader.readLine()) != null){

            }
            bufferedreader.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("file not found");
        }
        catch(IOException ex){
            System.out.println("error reading file");
        }
    }
}
