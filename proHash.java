import java.util.HashMap;
import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int score,newScore;
        score = s.nextInt();
        HashMap<String , Integer> student = new HashMap<String,Integer>();
        student.put("Nilanjan",30) ;
        if(student.get("Nilanjan") < score){
            student.put("Nilanjan",score);
        }
        for(String i: student.keySet() ){
            System.out.println(student.get(i));
        }
    }
}
