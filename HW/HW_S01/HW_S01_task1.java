/**
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */
public class HW_S01_task1 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        System.out.println(division(10, 1));
        System.out.println(findNum(array, 1));
        System.out.println(getNum(array, 5));
    }

    public static int division(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Деление на ноль!");
        }
        int res = a/b;
        return res;
    }

    public static int findNum(int[] array, int num) {
        int found = -1;        
        for (int index = 0; index < array.length; index++) {
            if (array[index] == num) {
                found = index;
            }
        }
        if (found == -1) {
            throw new RuntimeException("Число не найдено!");
        } else {
            return found;
        }
    }
    public static int getNum(int[] arr, int index) {
        if (index > arr.length-1) {
            throw new RuntimeException("В массиве нет элемента с таким индексом!");
        } else{
            return arr[index];
        }
    }
    
}