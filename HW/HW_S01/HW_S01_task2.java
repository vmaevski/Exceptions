/**
 * Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить? public static int sum2d(String[][] arr){ int sum = 0; for (int i = 0; i < arr.length; i++) { for (int j = 0; j < 5; j++) { int val = Integer.parseInt(arr[i][j]); sum += val; } } return sum; }
 */
public class HW_S01_task2 {
    public static void main(String[] args) {
        // 1. Если размер подмассива будет меньше 5
        // String[][] arr1 = {{"1", "2", "3", "4"}};
        String[][] arr1 = {{"1", "2", "3", "4", "5"}};
        System.out.println(sum2d(arr1));
        // 2. Если в элементе массива будет НЕцифра
        String[][] arr2 = {{"1", "2", "3", "4", "X"}};
        // String[][] arr2 = {{"1", "2", "3", "4", "5"}};
        System.out.println(sum2d(arr2));
    }
    
    public static int sum2d(String[][] arr){ 
        int sum = 0; 
        for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < 5; j++) { 
                int val = Integer.parseInt(arr[i][j]);
                sum += val; 
            } 
        } 
        return sum; 
    }
    
}