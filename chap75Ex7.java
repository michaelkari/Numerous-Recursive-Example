import java.util.*;

public class chap75Ex7{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String word=null;
    System.out.print("Please enter a string");
    word=sc.nextLine();
    boolean palin=palindrome(word);
    if(palin==true){
      System.out.println("The string \""+word+"\" is a palindrome");
    }
    else if(palin==false){
      System.out.println("The string \""+word+"\" is not a palindrome");
    }
  }
  public static boolean palindrome(String word){
    word=word.toLowerCase();
    if(word.equals("")||word.length()==1)
      return true;
    else if(Character.isLetterOrDigit(word.charAt(0))==false&&Character.isLetterOrDigit(word.charAt(word.length()-1))==false)
      return palindrome(word.substring(1,word.length()-1));
    else if(Character.isLetterOrDigit(word.charAt(0))==false)
      return palindrome(word.substring(1));
    else if(Character.isLetterOrDigit(word.charAt(word.length()-1))==false)
      return palindrome(word.substring(0,word.length()-1));
    else if(word.charAt(0)==word.charAt(word.length()-1))
      return palindrome(word.substring(1,word.length()-1));
    else
      return false;
  }
}