import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.*;

class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        ArrayList<Book> books=new ArrayList<>();
        int id;
        String title,author;
        double price;
        for(int i=0;i<4;i++){
            id=s.nextInt();
            s.nextLine();
            title=s.nextLine();
            author=s.nextLine();
            price=s.nextDouble();
            books.add(i,new Book(id, title, author, price));
        }
        s.nextLine();
        String t=s.nextLine();
        s.close();
        ArrayList<Book> result=searchTile(t, books);
        for(int i=0; i<result.size();i++){
            System.out.println(result.get(i).getId());
        }
    }
    public static ArrayList<Book> searchTile(String title, ArrayList<Book> books){
        ArrayList<Book> result=new ArrayList<Book>();
        for(int i=0;i<4;i++){
            if(books.get(i).getTitle().toLowerCase().contains(title.toLowerCase()))
                result.add(books.get(i));
        }
        Collections.sort(result,new SortById());
        return result;
    }
}

class SortById implements Comparator<Book>{
    public int compare(Book a, Book b){
        return a.getId()-b.getId();
    }
}

class Book{
    private int id;
    private String title;
    private String author;
    private double price;
    Book(int id, String title, String author, double price){
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }
    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
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
}