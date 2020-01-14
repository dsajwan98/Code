import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        long[] input=new long[5];
        long[] fact=new long[5];
        for(int i=0;i<5;i++){
            input[i]=s.nextLong();
            fact[i]=factorial(input[i]);
        }
        s.close();
        for(int i=0;i<5;i++){
            System.out.println(fact[i]);
        }
    }
    public static long factorial(long i){
        long fact=1;
        if(i==0)
            return 1;
        while(i>0){
            fact = fact * i;
            i--;
        }
        return fact;
    }
}