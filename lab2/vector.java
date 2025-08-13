
import java.util.Scanner;

public class vector{
    double[] arr;
  
    
  
    vector(double[] arr){
          this.arr=arr;
           Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){

            System.out.println("enter element number "+i);
           
            double num =sc.nextDouble();
            this.arr[i]=num;
        }
    }
 
 vector(vector m){

 }

   public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
            int len =sc.nextInt();
            double[] newarr= new double[len];
       vector v= new vector(newarr);
       
    }
}
