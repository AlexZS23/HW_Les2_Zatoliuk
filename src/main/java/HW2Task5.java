import java.util.Scanner;

public class HW2Task5 {

    /*    5. Write a Java program to generate random integers in a specific range.(Hint: Use Math class)*/

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите минимальное число диапазона");
        int minValue = in.nextInt();
        System.out.println("Введите максимальное число диапазона");
        int maxValue = in.nextInt();
        int randomNumber = minValue + (int) (Math.random() * ((maxValue - minValue) + 1));

        System.out.println("Random number is " + randomNumber);
    }
}
