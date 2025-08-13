public class ques_10 {
     public static double calcDeter(double a, double b, double c){
        return (b * b) - 4 * a * c;
    }
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[1]);
        if(calcDeter(a, b, c) < 0.0){
            double real = -b / 2 * a;
            double imag = Math.sqrt(calcDeter(a, b, c));
            System.out.println("Root is : "+real+"+"+imag+"i");
        }
        else{
            double root = (-b + Math.sqrt(calcDeter(a, b, c))) / 2 * a;
            System.out.println("Root is : "+root);
        }
    }
}
