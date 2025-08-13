import java.util.*;
public class ques_2 {
    public static void main(String[] args ){
        Scanner sca=new Scanner(System.in);
        int num=sca.nextInt();
        int fact =1;
         for(int i=num;i>0;i--){
              fact=fact*i;
         }
         System.out.println(fact);
    

    }
  
    
}
