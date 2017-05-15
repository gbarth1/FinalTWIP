package com.company;

/**
 * Created by gracebarth on 5/11/17.
 */
public class swag {

    public swag(String[] a, String[] b ){

        String[] filOne = a;
        String[] namers = b;
    }

    public String[] getFirstName(){
        String[] namesFirst = new String[27];
        for(int i = 0; i<=namers.length; i++){
            String NA = namers[i].indexOf(i+1);
            if(NA.equals(" ")){
                namesFirst[i]=namers[i].indexOf(0, i+1);
            }
        }
        return namesFirst;
    }

    public String[] getLastName(){
        String[] namesLast = new String[27];
        for(int i = 0; i<=namers.length; i++) {
            String NA = namers[i].indexOf(i + 1);
            if (namesLast[i] != namesFirst[i]) {
                if (NA.equals(" ")) {
                    namesLast[i] = namers[i].indexOf(i, i + 1);
                }
            }
        }
        return namesLast;
    }

    public int[] getSecretNumber(){
        int[] secretNumber = new int[27];
        for(int i = 0; i <=namers.length; i++){
            if(namers[i].indexOf(i)== 1||2||3||4||5||6||7||8||9){
                secretNumber[i] = namers[i].indexOf(i);
            }
        }
        return secretNumber;

    }

    public int getAvgTotalGrade(){
        int avgGrade=0;
        int[] avgTotalGrade = new int[27];
        for(int i = 0; i <=filOne.length; i++){
            if(filOne[i].indexOf(i).equals("+")){
                avgTotalGrade[i]= filOne[i].indexOf(i, i+3);
            }
        }
        for(int j=0; j<=avgTotalGrade.length(); j++){
            avgGrade+=avgTotalGrade.indexOf(i, i+1);
        }
        return avgGrade;

    }


}
