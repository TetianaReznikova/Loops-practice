package practice;

public class Task3 {
    public static void main (String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6};

        int counter = 0;
        int sum = 0;


        for (int i = numbers.length - 1; i >= 0; i--) {
            counter++;
            sum += numbers[i];
            System.out.println(counter + ") Num is " + numbers[i] + ", sum is " + sum);
        }
        System.out.println("________________________");
        System.out.println("Sum of numbers is " + sum);
    }
}
