import java.util.Scanner;

public class ques_6{
      public static void main(String[] args){
        int n=args.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(args[i]);
        }
        Scanner in=new Scanner(System.in);
        int key=in.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("it is in the array");
        }else{
            System.out.println("it is not in the array");
        }
    }
}
