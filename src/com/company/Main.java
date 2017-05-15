package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
	    String fileName = "rawDataU6.txt";
        String line = null;
        try{

            String []doc=new String[27];
            FileReader filereader= new FileReader(fileName);
            BufferedReader bufferedreader = new BufferedReader(filereader);
            while((line=bufferedreader.readLine()) != null){

                for(int i=0; i<=doc.length(); i++){
                    if(){
                        //if index of ... = tab , add doc[i]= that substring
                    }
                }

            }
            bufferedreader.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("file not found");
        }
        catch(IOException ex){
            System.out.println("error reading file");
        }

        String nameFile = "names.txt";
        String enil = null;
        try{

            String []name=new String[27];
            FileReader fr= new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            while((line=br.readLine()) != null){

                for(int i=0; i<=name.length(); i++){
                    if(){
                        //if index of ... = tab , add doc[i]= that substring
                    }
                }


            }
            br.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("file not found");
        }
        catch(IOException ex){
            System.out.println("error reading file");
        }

    }

    swag hr7 = new swag(doc, name);
}
