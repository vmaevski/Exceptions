package HW_S02;

import java.util.Scanner;
/**
 * 4.	Разработайте программу, которая выбросит Exception, 
 * когда пользователь вводит пустую строку. 
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class HW_S02_task4 {
    public static void main(String[] args) {
        float num;
        String str;
        while (true) {
            try {
                str = getString("Задайте число:\n");
                if (str.equals("")){
                    throw new RuntimeException("Ничего не задано...");
                }else{
                    num = Float.parseFloat(str);
                    System.out.println(num);
                    break;
                }
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
