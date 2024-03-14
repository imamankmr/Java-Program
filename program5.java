import java.util.*;
public class program5 {
    public static void main(String[] args) {
     Scanner sc= new Scanner (System.in);
      System.out.println("enter the number");
      int x=sc.nextInt();
      if(x%5==0 && x%11==0){
        System.out.println("the number is divisible by 5 and 11");
      }
      else{
        System.out.println("the number is not divisible by 5 and 11");
      }
    }
}
