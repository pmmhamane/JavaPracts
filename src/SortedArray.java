import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortedArray {
    //int N = sc.nextInt();


    public static int[] getIntegers(int S){
        Scanner sc = new Scanner(System.in);
        int[] a =  new int[S];
        for(int i=0 ; i< S; i++){
            a[i] = sc.nextInt();
        }
        return a;
    }


    public  int[] sortIntegers(int[] a){
       // int[] a;
      //  b = Arrays.sort(a, Collections.reverseOrder());

        int temp;

        for (int i = 0; i < a.length; i++)

        {

            for (int j = i + 1; j < a.length; j++)

            {

                if (a[i] < a[j])

                {

                    temp = a[i];

                    a[i] = a[j];

                    a[j] = temp;

                }

            }

        }
        return a;
    }

    public static void printArray(int[] a){
        for(int i = 0 ; i< a.length ; i++){
            System.out.println("Element "+i+" contents "+a[i]);
        }
    }
}
