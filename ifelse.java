import java.util.*;

public class ifelse{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("you are a adult");}
            if(age>13 && age<18){
                System.out.println("you are a teenager");
            }

        if(age<=13){
            System.out.println("chal be bada ho jaa pehle");
        }
    }
}