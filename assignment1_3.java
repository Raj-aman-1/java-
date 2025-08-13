public class assignment1_3{
     public static void main(String[] args) {
        int age = 20;
        boolean hasValidID = false;
        if (age >= 18) {
            if (hasValidID) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are 18 or older but need a valid ID to vote.");
            }
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}