import java.util.*;

public class chap75Ex6{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String word=null;
    System.out.print("Please enter a string");
    word=sc.next();
    boolean palin=palindrome(word);
    if(palin==true){
      System.out.println("The string \""+word+"\" is a palindrome");
    }
    else if(palin==false){
      System.out.println("The string \""+word+"\" is not a palindrome");
    }
  }
  public static boolean palindrome(String word){
    if(word.equals("")||word.length()==1)
      return true;
    else if(word.charAt(0)==word.charAt(word.length()-1))
      return palindrome(word.substring(1,word.length()-1));
    else
      return false;
  }
}