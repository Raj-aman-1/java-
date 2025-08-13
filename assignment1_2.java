public class assignment1_2 {
     public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        int smallest = numbers[0];
        int largest = numbers[0];
        for (int num : numbers) {
            sum += num;
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }}
        int average = sum / numbers.length;
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
