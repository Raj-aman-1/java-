import javax.swing.plaf.synth.SynthScrollBarUI;

public class wl2 {
    public static void main(String args[])
    {
        int number = 123455567;
        int reverse =0;
        while(number>0){
            int last_digit = number%10;
            System.out.print(last_digit);
            
            reverse = (reverse*10) + last_digit;
            number/=10;
        }
        System.out.println(reverse);
    }
    
    
}
