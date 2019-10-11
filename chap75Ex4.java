import java.util.*;

public class chap75Ex4{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String word=null;
    String word2=null;
    System.out.print("Please enter a string");
    word=sc.next();
    System.out.print("Please enter another string");
    word2=sc.next();
    boolean match=numX(word, word2);
    if(match==true){
      System.out.println("The string \""+word+"\" matches \""+word2+"\"");
    }
    else if(match==false){
      System.out.println("The string \""+word+"\" doesn't match \""+word2+"\"");
    }
  }
  public static boolean numX(String word, String word2){
    if(word.equals("")&&word2.equals(""))
      return true;
    else if(word.equals("")&& !(word2.equals(""))){
      if(word2.charAt(0)=='X'){
        return false;
      }
      else{
        return numX(word,word2.substring(1));
      }
    }
    else if(word2.equals("")&& !(word.equals(""))){
      if(word.charAt(0)=='X'){
        return false;
      }
      else{
        return numX(word.substring(1),word2);
      }
    }
    else if(word.charAt(0)=='X'&&word2.charAt(0)!='X')
      return false;
    else if(word2.charAt(0)=='X'&&word.charAt(0)!='X')
      return false;
    else
      return numX(word.substring(1),word2.substring(1));
  }
}