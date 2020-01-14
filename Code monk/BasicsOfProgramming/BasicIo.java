import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine(); //It searches for the next line character
    
        String name = s.nextLine();  
        s.close();               
        if(n>=0 && n<=10)
            System.out.println(n*2);
        if(name.length()>=1 && name.length()<=15)
            System.out.println(name);

    }
}
