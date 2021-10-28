package day18;
//Вам дан числовой массив произвольного размера. Посчитайте сумму чисел в этом массиве не используя циклы
// (необходимо использовать рекурсивные вызовы).
//
//Пример:
//int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
//System.out.println(recursionSum(...)); // 65346
//
//*recursionSum(...) - это ваш рекурсивный метод, который вернет сумму чисел в массиве numbers.
public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(mySum(numbers,numbers.length));
    }
    public static long mySum(int[] massiv, int index){
        if (index == 0){
            return 0;
        }
        else
        return massiv[index-1]+mySum(massiv,index-1);
    }
}
