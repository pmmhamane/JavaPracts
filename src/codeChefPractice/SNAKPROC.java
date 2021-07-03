package codeChefPractice;

import java.util.*;

public class SNAKPROC {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();

        while(R>0){

            int L =sc.nextInt();
            sc.nextLine();
            char[] input = new char[L];
//            for(int i=0; i< L ; i++){
//                input[i] = sc.next().charAt(0);
//           }
            String inputReport = sc.nextLine();
            input = inputReport.toCharArray();

            boolean snakeFoundFlag = false;
            boolean invalidReportFlag = false;
            for(int i=0 ; i<input.length ; i++){
                if(input[i] == 'T' && !snakeFoundFlag ){
                    invalidReportFlag = true;
                    break;
                }
                else if(input[i] =='H' && snakeFoundFlag){
                    invalidReportFlag = true;
                    break;
                }
                else if(input[i] == 'H' && !snakeFoundFlag ){
                    snakeFoundFlag = true;
                }
                else if(input[i]=='T' && snakeFoundFlag){
                    snakeFoundFlag=false;
                }
                else
                    continue;
            }

            // after parsing entire string, snakeFoundFlag has to be false.
            if(snakeFoundFlag){
                invalidReportFlag = true;
            }

            if(invalidReportFlag){
                System.out.println("Invalid");
            }else{
                System.out.println("Valid");
            }

            --R;
        }

    }
}
