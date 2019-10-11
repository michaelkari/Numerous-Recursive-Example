import java.util.*;

public class chap75Ex5{
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
    if(word.equals("")&&word2.equals("")){
      System.out.println("True");
      return true;
    }
    else if(word.equals("")||word2.equals("")){
      System.out.println("False bc doesn't equal");
      return false;
    }
    else if((word.charAt(0)=='a'||word.charAt(0)=='e'||word.charAt(0)=='i'||word.charAt(0)=='o'||word.charAt(0)=='u')&&(word2.charAt(0)=='a'||word2.charAt(0)=='e'||word2.charAt(0)=='i'||word2.charAt(0)=='o'||word2.charAt(0)=='u')){
      System.out.println("Return bc vowel");
      return doesItMatch(word.substring(1),word2.substring(1));
    }
    else if((word.charAt(0)=='A'||word.charAt(0)=='E'||word.charAt(0)=='I'||word.charAt(0)=='O'||word.charAt(0)=='U')&&(word2.charAt(0)=='A'||word2.charAt(0)=='E'||word2.charAt(0)=='I'||word2.charAt(0)=='O'||word2.charAt(0)=='U')){
      System.out.println("Return bc vowel");
      return doesItMatch(word.substring(1),word2.substring(1));
    }
    else{
      System.out.println("Return");
      return doesItMatch(word.substring(1),word2.substring(1));
    }
  }
}