package HW_S02;

/**
 * 2.	Если необходимо, исправьте данный код (задание 2 
 * https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 */
public class HW_S02_task2 {
    public static void main(String[] args) {
        // исходный код
        // try {
        int[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7 }; // Был не объявлен массив

        int d = 0;
        // double catchedRes1 = intArray[8] / d;
        int index = 8;
        if ((d != 0) && (index + 1 < intArray.length)) {
            double catchedRes1 = intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } else {
            if (d == 0) {
                System.out.println("d = 0. Деление на 0!");
            } else {
                if (index >= intArray.length) {
                    System.out.println("index = " + index + "\nЗадан индекс, превышающий максимально возможный!");
                }
            }
        }
        // } catch (ArithmeticException e) {
        // System.out.println("Catching exception: " + e);
        // }
    }

}
