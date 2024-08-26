package tech.it_mentor.part03_GettingToKnow_Branches_Cycles.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

/* 
Переходим дорогу вслепую
Работа светофора для пешеходов запрограммирована следующим образом:
в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты - жёлтый,
а потом в течение одной минуты - красный,
затем опять зелёный горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зелёный" - если горит зелёный цвет,
"жёлтый" - если горит жёлтый цвет,
"красный" - если горит красный цвет.

Пример для числа 2.5:
зелёный

Пример для числа 3:
жёлтый

Пример для числа 4:
красный

Пример для числа 5:
зелёный


Requirements:
1. Программа должна считывать вещественное число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если горит зелёный цвет, необходимо вывести текст: "зелёный"
4. Если горит жёлтый цвет, необходимо вывести текст: "жёлтый"
5. Если горит красный цвет, необходимо вывести текст: "красный"
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.ENGLISH);

        final double greenInterval = 3.0;
        final double yellowInterval = 1.0;
        final double redInterval = 1.0;

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        final double time = Double.parseDouble(bufferedReader.readLine());

        final double time = new Scanner(System.in).nextDouble();

        double interval = time % (greenInterval + yellowInterval + redInterval);

        if (interval >= greenInterval + yellowInterval) {
            System.out.println("красный");
        } else if (interval >= greenInterval) {
            System.out.println("жёлтый");
        } else {
            System.out.println("зелёный");
        }
    }
}