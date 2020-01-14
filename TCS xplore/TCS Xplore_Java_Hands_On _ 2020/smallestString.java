import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        String value=s.nextLine();
        char[] charArr=value.toCharArray();
        Arrays.sort(charArr);
        System.out.println(charArr[0]);
    }
}
