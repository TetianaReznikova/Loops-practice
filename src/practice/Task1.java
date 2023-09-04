package practice;

public class Task1 {
    public static void main (String[] args) {

        int [] numbers= {1, 2, 3, 4, 5, 6};
        int sum = 0;
        int counter = 0;

        for (int num = 0; num < 4; num++) {
            counter++;
            sum += numbers[num];
            System.out.println(counter + ") Num is " + numbers[num] + ", sum is " + sum);
        }
    System.out.println("________________________");
    System.out.println("Sum of numbers is " + sum);
    }
}
