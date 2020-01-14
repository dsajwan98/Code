import java.util.ArrayList;
import java.util.Scanner;
import  java.util.*;

class Solution {
    public static void main(String args[] ) throws Exception {
        /* Do not alter code in main method */
       Shirt[] shirts = new Shirt[5];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<5;i++)
        {
            int tag = sc.nextInt();sc.nextLine();
            String brand = sc.nextLine();
            double price = sc.nextDouble();sc.nextLine();
            char g = sc.nextLine().charAt(0);
            shirts[i] = new Shirt(tag,brand,price,g);
        }
        
        
       
        double price = sc.nextDouble();
        
        for(Shirt s: shirts)
        {
            System.out.println(getDiscountPrice(s));            
        }
        
        Shirt[] result = getShirtWithMoreThanSpecificPrice(shirts,price);
        
        for(Shirt s: result)
        {
            System.out.println(s.getTag()+" "+s.getPrice()+ " " + s.getBrand());
        }
    }
    
    public static double getDiscountPrice(Shirt s){
        if(s.getGender()=='m')
            return s.getPrice()- 0.1*s.getPrice();
        else if(s.getGender()=='f')
            return s.getPrice()- 0.2*s.getPrice();
        else if(s.getGender()=='u')
            return s.getPrice()- 0.3*s.getPrice();
        else
            return s.getPrice(); 
    }

    public static Shirt[] getShirtWithMoreThanSpecificPrice(Shirt[] shirts, double price){
        ArrayList<Shirt> greaterPriceShirts=new ArrayList<Shirt>();
        for(int i=0;i<5;i++){
            if(shirts[i].getPrice()> price){
                greaterPriceShirts.add(shirts[i]);
            }
        }
        Shirt[] g=new Shirt[greaterPriceShirts.size()];
        Collections.sort(greaterPriceShirts, new SortByPrice());
        g=greaterPriceShirts.toArray(g);
        return g;
    }
}

class SortByPrice implements Comparator<Shirt>{
    public int compare(Shirt a, Shirt b){
        return Double.compare(a.getPrice(), b.getPrice());
    }
}


class Shirt
{
    private int tag;
    private String brand;
    private double price;
    private char gender;
    Shirt(int tag, String brand, double price, char gender){
        this.tag=tag;
        this.brand=brand;
        this.price=price;
        this.gender=gender;
    }
    /**
     * @return the tag
     */
    public int getTag() {
        return tag;
    }
    /**
     * @param tag the tag to set
     */
    public void setTag(int tag) {
        this.tag = tag;
    }
    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }
    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }
    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }
    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }
}