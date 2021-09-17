import java.util.Scanner;
public class test {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    if (number % 2 == 1) {
        System.out.println("введённое число не чётное");
    } else {
        System.out.println("введённое число чётное");
    }
    }

}
