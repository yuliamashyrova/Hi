import java.util.Scanner;

public class Passw {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль");
        String pass1 = scanner.next();
        String pass2 = "1111";
        if (pass1.equals(pass2))
            System.out.println("Пароль совпадает");
        else System.out.println("Пароль не совпадает");
    }
}
