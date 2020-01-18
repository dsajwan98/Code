import java.util.Scanner;

class SieveOfErastothenes{
    static int max=10001;

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int input =s.nextInt();
        sieveOfEras(input);
    }
    public static void sieveOfEras(int n){
        boolean[] sArr=new boolean[max];
        for(int i=2;i<=n;i++)
            sArr[i]=true;
        for(int i=2;i<=n/2;i++){
            if(sArr[i]==true){
                for(int j=i*2;j<=n;j+=i)
                    sArr[j]=false;
            }
        }
        for(int i=0;i<=n;i++){
            if(sArr[i]==true)
                System.out.print(i+" ");
        }
    }
}