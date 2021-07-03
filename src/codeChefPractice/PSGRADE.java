package codeChefPractice;

import java.util.Scanner;

public class PSGRADE {

    public static void main(String args[]){

        Scanner sc  =new Scanner(System.in);

        int T = sc.nextInt();

        if(T>0 && T<=100){
            while(T>0){
                int Amin = sc.nextInt();
                int Bmin = sc.nextInt();
                int Cmin = sc.nextInt();
                int Tmin = sc.nextInt();
                int A = sc.nextInt();
                int B = sc.nextInt();
                int C = sc.nextInt();

                if(A>=Amin && B>=Bmin && C>=Cmin && (A+B+C)>=Tmin){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
                --T;
            }
        }

    }
}
