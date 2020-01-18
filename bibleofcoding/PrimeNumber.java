import java.util.Scanner;

class Prime{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int input =s.nextInt();
        System.out.println(isPrime(input));
        s.close();
    }
    public static boolean isPrime(int n){
        //Check for corner cases
        if(n<=1)
            return false;
        //Check for smaller divisor
        /*
            n=a*b
            let a=min(a,b)
            Prime number have two divisors
            Now, a<=b
            Multiply both sides by a
            a.a<=a.b
            a2<=n
            a<=sqrt(n)
            Now, if we find one divisor within this range it will declare the number as not prime.
        */
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i ==0)
                return false;
        }
        return true;
    }
}