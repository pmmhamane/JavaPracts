package codeChefPractice;

import java.util.Scanner;

public class Codechef {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        //Input validations
        if(T>=1 && T<=10000){

            while(T>0){
                int  X = sc.nextInt();
                int  Y = sc.nextInt();
                if(X>=1 && Y>=1 && X<=100 && Y<=100 && X<=(2*Y)){
                    //Actual logic starts
                    if(X>Y){
                        int count = 0;
                        do{
                            count++;
                            if(X<=(count+Y))
                                break;
                        }
                        while(X>(Y+count));
                        System.out.println(count);
                    }
                    else{
                        System.out.println(0);
                    }
                }
                --T;
            }
        }
    }
}
