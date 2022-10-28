package HW_S03;

import java.util.Scanner;

public class View {
    /**
     *
     */

    public String getString(String printText) {
        Scanner in = new Scanner(System.in);
        System.out.println(printText);
        return in.nextLine();
    }

    public void print(String text) {
        System.out.println(text);
    }
}
