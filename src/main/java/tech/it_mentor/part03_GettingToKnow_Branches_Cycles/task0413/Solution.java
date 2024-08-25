package tech.it_mentor.part03_GettingToKnow_Branches_Cycles.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует


Requirements:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введено число от 1 до 7, необходимо вывести день недели.
4. Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numDayWeek = Integer.parseInt(bufferedReader.readLine());

        String nameDayWeek;
        switch (numDayWeek) {
            case 1:
                nameDayWeek = "понедельник";
                break;
            case 2:
                nameDayWeek = "вторник";
                break;
            case 3:
                nameDayWeek = "среда";
                break;
            case 4:
                nameDayWeek = "четверг";
                break;
            case 5:
                nameDayWeek = "пятница";
                break;
            case 6:
                nameDayWeek = "суббота";
                break;
            case 7:
                nameDayWeek = "воскресенье";
                break;
            default:
                nameDayWeek = "такого дня недели не существует";
        }

        System.out.println(nameDayWeek);
    }
}