

public class program4 {
    public static void main(String[] args) {
        int i=1;
        while(i<=500){
            if(i%7==0 && i%10==7){
                System.out.println("the required number divisible by 7 or ends with 7 are"+i);
            }
            
            i++;
        }
      
    }
}
