package codeChefPractice;

public class Main2
{
    static String originalString="abcabc";

    private static int operationCount(String word, int input1,int input2){

        /*write your code here and return appropriate value*/
        StringBuffer sbf = new StringBuffer(word);
        StringBuffer tempbuffer =  new StringBuffer("");
        int count=0;

        do{
            for(int i=0; i<input1 ; i++){
                count++;
                char temp = sbf.charAt(sbf.length()-1);
                tempbuffer = sbf;
                sbf.deleteCharAt(sbf.length()-1);
                tempbuffer.append(temp);
                sbf =tempbuffer;
            }

            if(sbf.equals(word)){
                break;
            }


            for(int i=0; i<input2 ; i++){
                count++;
                char temp = sbf.charAt(sbf.length()-1);
                tempbuffer = sbf;
                sbf.deleteCharAt(sbf.length()-1);
                tempbuffer.append(temp);
                sbf =tempbuffer;
            }

        }
        while(! word.equals(sbf));

        return count;

    }

    // arguments are passed using the text field below this editor
    public static void main(String[] args)
    {
        originalString=args[0];
        System.out.println(operationCount(args[0],Integer.parseInt(args[1]),Integer.parseInt(args[2])));
        int P = Integer.parseInt(args[1]);
        int Q = Integer.parseInt(args[2]);

        System.out.println(operationCount(originalString,P,Q));;

    }
}

