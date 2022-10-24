import java.util.Scanner;
/**
 * 1.	Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и 
 * возвращает введенное значение. 
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, 
 * необходимо повторно запросить у пользователя ввод данных.
 */
public class HW_S02_task1 {
    public static void main(String[] args) {
        float num;
        while (true) {
            try {
                num = Float.parseFloat(getString("Задайте число:\n"));
                System.out.println(num);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Задайте число корректно!");
            }
        }        
    }

    public static String getString(String title) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%s", title);
        return in.nextLine();
    }

}
