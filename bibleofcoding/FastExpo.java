import java.util.Scanner;

public class FastExpo{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        //int input =s.nextInt();
        s.close();
        System.out.println(itFastE(5,13,1000000007));
    }
    public static int fastE(int a,int n,int mod){
        if(n==0)
            return 1;
        if(n%2==0)
            return fastE((a*a)%mod, n/2, mod);
        return (a*fastE(a, n-1, mod))%mod;
    }

    public static int itFastE(int a, int n, int m){
        int ans=1;
        while(n>=1){
            if(n%2==0){
                a=(a*a)%m;
                n/=2;
            }
            else{
                ans=(ans*a)%m;
                n--;
            }
        }
        return ans;
    }
}