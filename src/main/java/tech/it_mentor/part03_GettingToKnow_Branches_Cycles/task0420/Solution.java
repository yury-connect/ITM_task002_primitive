package tech.it_mentor.part03_GettingToKnow_Branches_Cycles.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить три числа разделенных пробелами.
4. Программа должна выводить числа в порядке убывания.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] numArr = bufferedReader.lines().takeWhile(line -> !line.isEmpty()).mapToInt(Integer::parseInt).toArray();
        bufferedReader.close();

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr.length; j++) {
                if (numArr[i] > numArr[j]) {
                    int tmp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = tmp;
                }
            }
        }

        for (int item: numArr) {
            System.out.print(item + " ");
        }
    }
}
