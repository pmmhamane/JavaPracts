package codeChefPractice;

import java.util.Scanner;

public class EQUINOX {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();

        while(T>0){

            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            sc.nextLine();

            int Ascore =0;
            int Bscore = 0;

            String[] arr = new String[N];
            for(int i=0; i <N; i++){
                arr[i] = sc.nextLine();
            }


            for(int i=0 ; i<N ; i++){
                char  a = arr[i].toUpperCase().charAt(0);
                System.out.println("value of a "+a);

                boolean foundFlag = false;
                for(int j=0 ; j<"EQUINOX".length() ; j ++){
                    if("EQUINOX".charAt(j) == a){
                        foundFlag = true;
                        Ascore += A;
                        break;
                    }
                }

                if(!foundFlag)
                    Bscore += B;
            }

            if(Ascore>Bscore)
                System.out.println("SARTHAK");
            else if (Bscore>Ascore)
                System.out.println("ANURADHA");
            else
                System.out.println("DRAW");

            --T;
        }

    }
}
