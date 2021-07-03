package codeChefPractice;

import java.util.*;

public class LONGSEQ {

    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        while(T>0){
            String D = sc.nextLine();
            char[] S = D.toCharArray();

            //counting 0 in array
            int count0 =0;
            for(int i=0; i<S.length ; i++){
                if(S[i] =='0' ){
                    count0++;
                }
                if(count0 > 1)
                    break;
            }

            //counting 1 in array
            int count1 =0;
            for(int i=0; i<S.length ; i++){
                if(S[i] =='1' ){
                    count1++;
                }
                if(count1 > 1)
                    break;
            }

            if((count1 > 1 && count0 > 1)  || (count1 > 1 && count0 ==0) || (count1 ==0 && count0 > 1)){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }


            --T;
        }

    }
}
