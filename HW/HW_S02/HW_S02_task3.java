package HW_S02;

/**
 * 3. Дан следующий код, исправьте его там, где требуется (задание 3
 * https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 */
public class HW_S02_task3 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // try {
        int a = 90;
        int b = 3;
        // System.out.println(a / b);
        if (b == 0) {
            System.out.println("b = 0. Делить на 0 нельзя!");
        } else {
            System.out.println(a / b);
        }
        printSum(23, 234);
        int[] abc = { 1, 2 };
        // abc[3] = 9;
        int index = 3;
        if (index < abc.length) {
            abc[index] = 9;
        } else {
            System.out.println(" index = " + index + ". Массив не имеет элемента с таким индексом.");
        }
        // } catch (Throwable ex) {
        // System.out.println("Что-то пошло не так...");
        // } catch (NullPointerException ex) {
        // System.out.println("Указатель не может указывать на null!");
        // } catch (IndexOutOfBoundsException ex) {
        // System.out.println("Массив выходит за пределы своего размера!");
        // }
    }

    public static void printSum(Integer a, Integer b) { // throws FileNotFoundException {
        System.out.println(a + b);
    }

}

/**
 * 3. Дан следующий код, исправьте его там, где требуется (задание 3
 * https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 */
// public class HW_S02_task3 {
// public static void main(String[] args) throws Exception {
// try {
// int a = 90;
// int b = 3;
// // System.out.println(a / b);

// printSum(23, 234);
// int[] abc = { 1, 2 };
// abc[3] = 9;
// } catch (Throwable ex) {
// System.out.println("Что-то пошло не так...");
// } catch (NullPointerException ex) {
// System.out.println("Указатель не может указывать на null!");
// } catch (IndexOutOfBoundsException ex) {
// System.out.println("Массив выходит за пределы своего размера!");
// }
// }

// public static void printSum(Integer a, Integer b) throws
// FileNotFoundException {
// System.out.println(a + b);
// }

// }
