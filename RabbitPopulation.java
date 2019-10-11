import java.util.*;

public class RabbitPopulation{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int month;
    System.out.println("Please enter a number of months");
    month=sc.nextInt();
    System.out.println("After "+month+" months you will have  "+rabbit(month)+" rabbits");
  }
  public static int rabbit(int month){
    if(month==0){
      return 0;
    }
    else if(month==1){
      return 1;
    }
    else{
      return rabbit(month-1)+rabbit(month-2);
    }
  }
}