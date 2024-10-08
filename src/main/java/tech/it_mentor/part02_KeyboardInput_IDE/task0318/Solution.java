package tech.it_mentor.part02_KeyboardInput_IDE.task0318;

/* 
План по захвату мира
Ввести с клавиатуры число и имя, вывести на экран строку:
"имя" захватит мир через "число" лет. Му-ха-ха!

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.


Requirements:
1. Программа должна выводить текст.
2. Программа должна считывать данные с клавиатуры.
3. Выведенный текст должен содержать введенное имя.
4. Выведенный текст должен содержать введенное число.
5. Выведенный текст должен полностью соответствовать заданию.
6. Получить данные с клавиатуры можно через  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
7. Читать строки из BufferedReader можно через String a = reader.readLine();
8. ЧИСЛО ДОЛЖНО БЫТЬ int !!!
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int count = scanner.nextInt();
        System.out.printf("%s захватит мир через %d лет. Му-ха-ха!", name, count);
    }
}
