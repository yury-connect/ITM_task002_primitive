package tech.it_mentor.part03_GettingToKnow_Branches_Cycles.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Существует ли пара?
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2

б) при вводе чисел
2
2
2
получим вывод
2 2 2

Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если два числа равны между собой, необходимо вывести числа на экран.
4. Если все три числа равны между собой, необходимо вывести все три.
5. Если нет равных чисел, ничего не выводить.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//        int[] numArr = bufferedReader.lines().mapToInt(Integer::parseInt).toArray(); // чтобы закончить ввод с клавиатуры:  'ctrl' + 'd'


        // Используем Stream и фильтруем пустую строку для завершения
        int[] numArr = bufferedReader.lines().takeWhile(line -> !line.isEmpty()).mapToInt(Integer::parseInt).toArray();

        // Закрываем BufferedReader
        bufferedReader.close();

        StringBuilder result = new StringBuilder();
        boolean isContinue = true;
        for (int i = 0; i < numArr.length && isContinue; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[i] == numArr[j]) {
                    if (isContinue) {
                        result.append(numArr[i]);
                        isContinue = false;
                    }
                    result.append(" ");
                    result.append(numArr[j]);
                }
            }
        }

        System.out.println(result.toString());
    }
}