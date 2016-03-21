import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumOfVBigNums{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String arr[] = n>0?new String[n]:new String[1];
        int maxlen=0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
            maxlen=maxlen<arr[arr_i].length()?arr[arr_i].length():maxlen;
        }
        int carry=0;
        int sum=0;
        StringBuilder finalsum=new StringBuilder("");
            
            for(int indx=maxlen-1;indx>=0;indx--)
            {
                sum=0;
                for(String digit:arr)
                {
                sum+=digit.length()>indx?digit.charAt(indx)-48:0;
                }
            sum+=carry;
            carry=sum/10;
            finalsum.append(sum%10);
            //    System.out.print(sum%10);
            }
        if (sum>=10)
            finalsum.append(carry);
        finalsum.reverse();
        System.out.println(finalsum.toString());
    }
    
}
