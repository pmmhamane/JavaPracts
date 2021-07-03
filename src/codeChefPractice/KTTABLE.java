package codeChefPractice;

import java.util.Scanner;

public class KTTABLE {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T > 0){

            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];

            for(int i=0 ; i< N ; i++){
                A[i] = sc.nextInt();
            }


            for(int i=0 ; i< N ; i++){
                B[i] = sc.nextInt();
            }


            int count = 0;
            for(int i=0 ; i <N; i++){
                int availableTime = A[i];
                if(i>0){
                    availableTime = A[i] - A[i-1];
                }
                if(B[i] <= availableTime){
                    count++;
                }
            }

            System.out.println(count);

            --T;
        }

    }
}
