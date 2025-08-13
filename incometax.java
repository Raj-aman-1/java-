import java.util.*;
public class incometax {
    public static void main(String args[]){
        Scanner aman = new Scanner(System.in);
        double income = aman.nextDouble();
        if(income<500000)
        {
            System.out.println("tax is"+income*.10);
        }else if ((income>=500000) &&(income<=1000000)){
            System.out.println("tax is"+income*.20);
        }else{
            System.out.println("tax is"+income*.30);
        }
    }
    
}
