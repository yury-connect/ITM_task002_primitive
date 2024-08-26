package tech.it_mentor.part03_GettingToKnow_Branches_Cycles.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Суммирование
Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.

Подсказка: один из вариантов решения этой задачи, использовать конструкцию:

while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}

Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Если пользователь ввел -1, программа должна вывести сумму всех введенных чисел на экран и завершиться.
3. Программа должна посчитать сумму введенных чисел и вывести её на экран.
4. В программе должен использоваться цикл for, while или do-while.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        boolean isContinue = true;
        do {
            int current = scanner.nextInt();
            result += current;
            if (current == -1) {
                isContinue = false;
            }
        } while (isContinue);

        System.out.println(result);;
    }
}
