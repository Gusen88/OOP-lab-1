import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();

        System.out.println("Введите k: ");
        int k = scanner.nextInt();

        System.out.println("Укажите символ: ");
        String symbol = scanner.next();

        int len = 0;
        for (int i = 0; i < text.length(); i++) {

            if (" !?:;,./".indexOf(text.charAt(i)) == -1)
            {
                len++;
                if (len%k == 0) text = text.substring(0, i) + symbol + text.substring(i + 1);
            } else len = 0;

        }

        System.out.println(text);
    }
}