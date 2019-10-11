import java.util.*;

public class chap75Ex3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String word=null;
    String word2=null;
    System.out.print("Please enter a string");
    word=sc.next();
    System.out.print("Please enter another string");
    word2=sc.next();
    boolean match=doesItMatch(word, word2);
    if(match==true){
      System.out.println("The string \""+word+"\" matches \""+word2+"\"");
    }
    else if(match==false){
      System.out.println("The string \""+word+"\" doesn't match \""+word2+"\"");
    }
  }
  public static boolean doesItMatch(String word, String word2){
    if(word.equals("")&&word2.equals(""))
      return true;
    else if(word.equals("")||word2.equals(""))
      return false;
    else if(!(word.charAt(0)==word2.charAt(0)||word.charAt(0)=='?'||word2.charAt(0)=='?'))
      return false;
    else
      return doesItMatch(word.substring(1),word2.substring(1));
  }
}