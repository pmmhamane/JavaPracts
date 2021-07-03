import java.util.Scanner;

//Adding few comments here for git
public class Hello {

    public static void main(String args[]){

         Scanner sc = new Scanner(System.in);

        System.out.println("-- Enter the Number of elements  : - \n");

        int N = sc.nextInt();
        int[] a= new int[N];


        for(int i=0; i<N ; i++ ){
            System.out.println("element " + i + " : " );
            a[i] = sc.nextInt();
         }

        ReverseArray.reverse(a);

    }

}
