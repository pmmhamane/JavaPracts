package codeChefPractice;

import java.util.Scanner;

public class CCHEAVEN {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T>0){

            int L = sc.nextInt();
            sc.nextLine();
            String S = sc.nextLine();

            char[] arr = S.toCharArray();

            int count0=0;
            int count1=0;

            for(int i=0; i<arr.length ; i++){
                if(arr[i]=='0'){
                    count0++;
                }
                else{
                    count1++;
                }

                if(count1>=count0){
                    break;
                }
            }

            if(count1>=count0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
