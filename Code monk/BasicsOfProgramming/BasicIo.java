/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine(); //It searches for the next line character
        
        String name = s.nextLine();                 
        if(n>=0 && n<=10)
            System.out.println(n*2);
        if(name.length()>=1 && name.length()<=15)
            System.out.println(name);// Writing output to STDOUT

        

        // Write your code here

    }
}
