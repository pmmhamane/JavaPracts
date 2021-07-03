package codeChefPractice;

import java.util.Scanner;

public class MSNSADM1 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while( T > 0){

            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            int highScore = 0;

            for(int i=0; i<N; i++){
                A[i]=sc.nextInt();
            }


            for(int i=0; i<N; i++){
                B[i]=sc.nextInt();
            }

            for(int i=0 ; i<N ; i++){

                if(  ( A[i]*20 - B[i]*10 ) > highScore  ){
                    highScore = A[i]*20 - B[i]*10 ;
                }
            }

            System.out.println(highScore);
            --T;
        }

    }
}
