package codeChefPractice;

import java.util.Scanner;

public class TWOSTR {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        while(T>0){

            String X = sc.nextLine();
            String Y = sc.nextLine();
            boolean successFlag = true;

            for(int i=0; i<X.length() ; i++){
                if(X.charAt(i) == Y.charAt(i) || X.charAt(i) == '?' || Y.charAt(i) =='?'){
                    continue;
                }
                else
                    successFlag=false;
                break;
            }

            if(successFlag){
                System.out.println("Yes");
            }
            else
                System.out.println("No");
        }

    }
}
