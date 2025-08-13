public class ques_5 {
     public static void main(String[] args) {
        String str = args[0];
        int i = 0, j = str.length() - 1;
        boolean flag = true;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }

    }
}
