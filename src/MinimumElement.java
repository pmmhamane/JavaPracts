import java.util.Scanner;

public  class MinimumElement {

    public int readInteger(){
        int N;
        Scanner sc =  new Scanner(System.in);
        N=sc.nextInt();
        return N;
    }


    public static int[] readElements(int N){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[N];
        for(int i=0; i<N ; i++){
            a[i] = sc.nextInt();
        }

        return a;
    }

    public static int findMin(int[] a){
        int min;
        min = a[0];
        for(int i=0 ; i<a.length ; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }
}
