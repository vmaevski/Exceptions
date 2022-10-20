/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и 
 * возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
 * Если длины массивов не равны, необходимо как-то оповестить пользователя. 
 * Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
 */
public class HW_S01_task3 {
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 4, 6, 8, 10};
        printArray(getDivArr(arr1, arr2));
    }
    
    public static int[] getDivArr(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массивы разной длины!");
        }
        int[] divArr = new int[arr1.length];
        for (int i = 0; i < divArr.length; i++) {
            divArr[i] = arr2[i] / arr1[i];
        }
        return divArr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
