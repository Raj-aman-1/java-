import java.util.Scanner;

public class ques_9 {
     public static void main(String[] args){
        double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(args[1]);
        Scanner sc=new Scanner(System.in);
        String op=sc.nextLine();
        switch(op){
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "%":
                System.out.println(a%b);
                break;
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
