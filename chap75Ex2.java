import java.util.*;

public class chap75Ex2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String word=null;
    System.out.println("Please enter a string");
    word=sc.next();
    System.out.println("The string \""+word+"\" without vowels is "+charCounter(word));
  }
  public static String charCounter(String word){
    if(word.equals("")){
      return "";
    }
    else if(word.charAt(0)=='a'||word.charAt(0)=='A'){
      return charCounter(word.substring(1));
    }
    else if(word.charAt(0)=='e'||word.charAt(0)=='E'){
      return charCounter(word.substring(1));
    }
    else if(word.charAt(0)=='i'||word.charAt(0)=='I'){
      return charCounter(word.substring(1));
    }
    else if(word.charAt(0)=='o'||word.charAt(0)=='O'){
      return charCounter(word.substring(1));
    }
    else if(word.charAt(0)=='u'||word.charAt(0)=='U'){
      return charCounter(word.substring(1));
    }
    else{
      return word.substring(0).charAt(0)+charCounter(word.substring(1));
    }
  }
}