package codeChefPractice;
import java.util.*;

public class SOLBLTY {


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T>0){

            int X =sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(( A + (100 - X)*B) * 10 );

            --T;
        }
    }
}
