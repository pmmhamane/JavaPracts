package codeChefPractice;

import java.util.Scanner;

public class TLG {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] S = new int[N];
        int[] T = new int[N];
        int lead =0;
        int W = 0;

        for(int i=0 ; i<N; i++){
            S[i] = sc.nextInt();
            T[i] = sc.nextInt();
        }

        for(int i=0 ; i<N ; i++){
            if(i>0) {
                S[i] += S[i - 1];
                T[i] += T[i - 1];
            }
                if (Math.abs(S[i] - T[i]) > lead) {
                     lead = Math.abs(S[i]-T[i]);

                    if (S[i] > T[i]) {
                        W = 1;
                        //lead = S[i] - T[i];
                    } else {
                        W = 2;
                      //  lead = T[i] - S[i];
                    }
                }
        }
        System.out.println(W + " " + lead);
    }
}
