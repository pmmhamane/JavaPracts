package codeChefPractice;

import java.lang.*;
import java.util.*;

public class SLOOP {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T>0){
            int M = sc.nextInt();
            int S = sc.nextInt();

            System.out.println(M/S);
            --T;
        }
    }
}
