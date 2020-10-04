import java.util.*;
class Solution{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Integer a;
        a=sc.nextInt();
        Integer t=a;
        if(a<0)
            t=(-1)*a;
        String s=t.toString();
        char arr[]=new char[s.length()];
        char result[]=new char[s.length()+1];
        char temp[]=new char[s.length()+1];
        arr=s.toCharArray();
        int j=0;
        for(int i=0;i<s.length()+1;i++){
            if(i==s.length())
                temp[i]='5';
            else
                temp[i]=arr[j++];
        }
        int index=0;
        Arrays.sort(temp);
        for(int i=0;i<s.length()+1;i++){
            if(temp[i]=='5')
                index=i;
        }
        j=0;
        if(a > 0){
            index=s.length()-index;
        }
        for(int i=0;i<s.length()+1;i++){
            if(i==index)
                result[i]='5';
            else
                result[i]=(char)arr[j++];
        }
        if(a>0)
         System.out.print(result);
        else{
            System.out.print('-');
            System.out.print(result);  
        }
        

    }
}