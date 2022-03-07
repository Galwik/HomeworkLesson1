import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int sum = 0;
        int max = 0;

        for (int i = 1; i <= size; i++) {

            System.out.println("Enter a number: [" + i + "/" + size + "] ");
            int input = scanner.nextInt();
            numbers[i - 1] = input;

            if (i == 1) max = input;
            if (input > max) max = input;

        }

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("average of the numbers: " + (double) sum / size);
        System.out.println("maximum value: " + max);

    }
}
