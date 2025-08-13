import java.util.*;
public class ques_3{
    public static void main(String[] args){
        int num=0;
        if(args.length>0)
        num =Integer.parseInt(args[0]);
    else System.out.println("invalid output");
    
for(int i=0;i<num;i++){
    System.out.println( fib(i));
   
}
    
    }
    public static int  fib(int num){
        if(num==1)return 1;
        if(num==0)return 0;
          return fib(num - 1) + fib(num - 2);
       
    }
    
}
