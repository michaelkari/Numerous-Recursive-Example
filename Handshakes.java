import java.util.*;

public class Handshakes{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int people;
    System.out.println("Please enter a number of people");
    people=sc.nextInt();
    System.out.println("with "+people+" people you will have  "+handshake(people)+" handshakes");
  }
  public static int handshake(int people){
    if(people==0){
      return 0;
    }
    else if(people==1){
      return 0;
    }
    else if(people==2){
      return 1;
    }
    else{
      return handshake(people-1)+(people-1);
    }
  }
}