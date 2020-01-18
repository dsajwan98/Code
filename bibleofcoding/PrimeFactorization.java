//package bibleofcoding;

import java.util.*;

public class PrimeFactorization{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int[] f=new int[100];
        int[] exp=new int[100];
        int input =s.nextInt();
        int len=primeFactor(input, f,exp);
        for(int i=1;i<=len;i++){
            System.out.println(f[i]+" "+exp[i]);
        }
        s.close();
    }
    public static int primeFactor(int n, int[] f, int[] exp){
        int d=2, len=0,k=0;
        if(n==1){
            len++;
            f[len]=0;
            exp[len]=0;
            return len;
        }
        while(n>1 && d<=Math.sqrt(n)){
            k=0;
            while(n%d == 0){
                n/=d;
                k++;
            }
            if(k>0){
                len++;
                f[len]=d;
                exp[len]=k;
            }
            d++;
        }
        if(n>1){
            len++;
            f[len]=n;
            exp[len]=1;
        }
        return len;
    }
 
}