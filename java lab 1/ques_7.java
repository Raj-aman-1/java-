import java.util.Scanner;

public class ques_7 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = 0;
        boolean flag = true;
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == '1'){
                num += (int)Math.pow(2, i);
            } else if (str.charAt(i) == '0') {
                continue;

            }else{
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("The number is : "+num);
        }
        else{
            System.out.println("Please enter a correct binary number");
        }
    }
}
