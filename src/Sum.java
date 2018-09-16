import java.util.Scanner;

public class Sum {
    public static void main(String[] args)
    {
        System.out.print("Сколько целых чисел ввести? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbmount = new int[size];
        System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
        int sum = 0;
        int com = 1;
        while (sum != 0) {  //подсчитать сумму чисел
            sum = sum + sum % 10;
            sum = sum / 10;
        }
        System.out.println("Cумма введённых чисел: " + sum);

    }
}
