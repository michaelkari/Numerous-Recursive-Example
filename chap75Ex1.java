import java.util.*;

public class chap75Ex1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String word=null;
    char x;
    System.out.println("Please enter a string");
    word=sc.next();
    System.out.println("Please enter a character");
    x=sc.next().charAt(0);
    System.out.println("The string \""+word+"\" has "+charCounter(word,x)+" "+x+"(s)");
  }
  public static int charCounter(String word, char x){
    if(word.equals("")){
      return 0;
    }
    else if(word.charAt(0)==x){
      return 1+charCounter(word.substring(1),x);
    }
    else{
      return 0+charCounter(word.substring(1),x);
    }
  }
}