package practice;

public class Task2 {
    public static void main (String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int counter = 0;

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] % 3 == 0)
            {
                counter++;
                sum +=numbers[i];
                System.out.println(counter + ") Num is " + numbers[i] + ", sum is " + sum);
            }
        }
        System.out.println("________________________");
        System.out.println("Sum of numbers is " + sum);
    }
}
