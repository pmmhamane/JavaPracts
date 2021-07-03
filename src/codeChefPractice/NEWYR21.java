package codeChefPractice;

import java.util.Scanner;

public class NEWYR21 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        if(S.contains("newyear") && S.contains("2021")){

            boolean scanCompleteNewYear = false;
            int count = 0;
            int currentNewYearIndex = 0;

            while(!scanCompleteNewYear) {

                int newYearIndex = S.indexOf("newyear",currentNewYearIndex);
                //System.out.println("newYearIndex :- " + newYearIndex);
                if(newYearIndex >= 0 ){
                    boolean scanComplete2021 = false;
                    int current2021Index = newYearIndex;
                    while (!scanComplete2021) {
                        if (S.indexOf("2021", current2021Index) >= 0) {
                            current2021Index = S.indexOf("2021", current2021Index) + 1;
                            //System.out.println("current2021Index :- " + current2021Index);
                            count++;
                        } else {
                            scanComplete2021 = true;
                        }
                    }
                    currentNewYearIndex = newYearIndex + 1;
                }
                else{
                    scanCompleteNewYear = true;
                }

            }

            System.out.println(count);
        }
        else{
            System.out.println(0);
        }
    }
}
