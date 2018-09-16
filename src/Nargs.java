import java.util.Scanner;
public class Nargs {
    public static void main(String[] args)
    {
        System.out.print("Сколько целых чисел ввести? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbmount = new int[size];
        System.out.print("Введите целые числа через пробел " + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            numbmount[i] = scanner.nextInt();
        }
        // Вывести четные и нечетные числа
        for (int i = 0; i < size; i++)
            if (numbmount[i] % 2 != 0)
                System.out.println("Нечётное число:" + numbmount[i]);
            else if (numbmount[i] % 2 == 0)
                System.out.println("Чётное число:" + numbmount[i]);

        // Наименьшее число

        int min = numbmount[0];
        for (int i = 0; i < size; i++) {
            if (min > numbmount[i])
                min = numbmount[i];
        }
        System.out.println("Наименьшее число:" + min);

        // Наибольшее число

        int max = numbmount[0];
        for (int i = 0; i < size; i++) {
            if (max < numbmount[i])
                max = numbmount[i];
        }
        System.out.println("Наибольшее число:" + max);

        // Числа, которые делятся на 3 или на 9
        for (int i = 0; i < size; i++)
            if ((numbmount[i] % 3 == 0) || (numbmount[i] % 9 == 0)) // для задания достаточно 1й проверки
                System.out.println("Число, которое делится на 3 или 9: " + numbmount[i]);


        // Числа, которые делятся на 5 и на 7
        for (int i = 0; i < size; i++)
            if ((numbmount[i] % 5 == 0) && (numbmount[i] % 7 == 0))  // (5 AND 7) для задания достаточно только 1й if
                System.out.println("Число, которое делится на 5 и 7: " + numbmount[i]);
    }
}
