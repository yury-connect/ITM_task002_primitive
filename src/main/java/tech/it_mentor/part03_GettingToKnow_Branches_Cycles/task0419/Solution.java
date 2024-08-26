package tech.it_mentor.part03_GettingToKnow_Branches_Cycles.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран максимальное из четырёх чисел.
4. Если максимальных чисел несколько, необходимо вывести любое из них.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//        int[] numArr = bufferedReader.lines().mapToInt(Integer::parseInt).toArray(); // чтобы закончить ввод с клавиатуры:  'ctrl' + 'd'

        // Используем Stream и фильтруем пустую строку для завершения
        int[] numArr = bufferedReader.lines().takeWhile(line -> !line.isEmpty()).mapToInt(Integer::parseInt).toArray();

        // Закрываем BufferedReader
        bufferedReader.close();

        int max = numArr[0];
        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i] > max) {
                max = numArr[i];
            }
        }
        System.out.println(max);
    }
}


