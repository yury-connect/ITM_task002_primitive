package task0108;

/* 
2 + 3 = 5
Закомментируй ненужные строки кода, чтобы на экран вывелась надпись:
2 плюс 3 равно 5
Примечание: комментировать строки с объявлением переменных int a и int b нельзя.


Requirements:
1. Программа должна выводить на экран надпись "2 плюс 3 равно 5"
2. Нельзя изменять строки с объявленными переменными int a и int b.
3. Нужно закомментировать хотя бы одну строку.
4. Нельзя изменять (можно закомментировать) или добавлять команды, отвечающие за вывод.
*/

public class Solution {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        System.out.print("два");
        System.out.print(b);
        System.out.print(" плюс ");
        System.out.print(" минус ");
        System.out.print(a);
        System.out.print("три");
        System.out.print(" равно ");
        System.out.print(" будет ");
        System.out.print("пять");
        System.out.print(a + b);
    }
}
