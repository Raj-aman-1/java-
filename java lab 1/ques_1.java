import java.util.*;
public class ques_1{
    public static void main(String[] args){
Scanner sca =new Scanner(System.in);
int a= sca.nextInt();
int count=0;
for(int i=2;i<a/2;i++){
if(a%i==0)count++;

}
if(count==0)System.out.println("prime number");
else System.out.println("composite number");
   count=0;
    }

  
}

