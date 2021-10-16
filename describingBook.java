

public class describingBook
{
  String bookName;
  int numberOfPages;
  boolean eBook;
  
  void readBook(){
      System.out.println("You are reading " + bookName + "!");
    }
    
  void closeBook(){
      System.out.println("The book is closed");
    }  
  
  void currentPage(){
      System.out.println("You are on the page number " + numberOfPages);  
    }  
    
  void isThatEbook(){
      System.out.println("Is that ebook?" + "\n" + eBook);      
    }  
    
    
    
}
