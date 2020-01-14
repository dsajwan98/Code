import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        ArrayList<Document> documents=new ArrayList<Document>(); 
        int id,pages;
        String title,folderName;
        for(int i=0;i<4;i++){
            id=s.nextInt();
            s.nextLine();
            title=s.nextLine();
            folderName=s.nextLine();
            pages=s.nextInt();
            documents.add(i,new Document(id, title, folderName, pages));
        }
        ArrayList<Document> oddDocuments=docsWithOddPages(documents);
        Collections.sort(oddDocuments,new SortbyId());
        for(int i=0;i<=oddDocuments.size()-1;i++){
            System.out.println(oddDocuments.get(i).getId()+" "+oddDocuments.get(i).getTitle()+" "+oddDocuments.get(i).getFolderName()+" "+oddDocuments.get(i).getPages());
        }
    }

    public static ArrayList<Document> docsWithOddPages(ArrayList<Document> documents){
        ArrayList<Document> oddDocuments=new ArrayList<Document>();
        for(int i=0;i<4;i++){
            if(documents.get(i).getPages() % 2 !=0)
                oddDocuments.add(documents.get(i));
        }
        return oddDocuments;
    }
}

class SortbyId implements Comparator<Document>{
    public int compare(Document a, Document b){
        return a.getId() - b.getId();
    }
}
class Document{
    private int id;
    private String title;
    private String folderName;
    private int pages;
    Document(int id,String title, String folderName,int pages){
        this.id=id;
        this.title=title;
        this.folderName=folderName;
        this.pages=pages;
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
     * @return the folderName
     */
    public String getFolderName() {
        return folderName;
    }
    /**
     * @param folderName the folderName to set
     */
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }
    /**
     * @return the pages
     */
    public int getPages() {
        return pages;
    }
    /**
     * @param pages the pages to set
     */
    public void setPages(int pages) {
        this.pages = pages;
    }
}