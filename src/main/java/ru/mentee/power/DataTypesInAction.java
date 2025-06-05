package ru.mentee.power;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class DataTypesInAction {
    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("1. Целочисленное деление:");
        int a = 7, b = 2;
        int result1 = a / b;
        System.out.println(a + " / " + b + " = " + result1 + " (дробная часть отбрасывается)");

        System.out.println("\n2. Деление с плавающей точкой:");
        double result2 = 7 / 2.0;
        System.out.println("7 / 2.0 = " + result2 + " (результат с плавающей точкой)");

        System.out.println("\n3. Явное приведение типов:");
        double d = 3.75;
        int intVal = (int) d;
        System.out.println("double " + d + " к int: " + intVal + " (дробная часть отбрасывается)");

        char ch = (char) 65;
        System.out.println("int 65 к char: '" + ch + "' (символ с кодом 65)");

        long big = 9223372036854775807L;
        int overflowed = (int) big;
        System.out.println("long " + big + " к int: " + overflowed + " (переполнение)");

        System.out.println("\n4. Автоматическое повышение типа:");
        byte x = 10, y = 20;
        int sum = x + y;
        System.out.println("byte + byte = int: " + x + " + " + y + " = " + sum);

        double res = 5 * 2.5;
        System.out.println("int * double = double: 5 * 2.5 = " + res);

        System.out.println("\n5. Операции с boolean:");
        boolean t = true, f = false;
        System.out.println("true && false = " + (t && f));
        System.out.println("true || false = " + (t || f));
        System.out.println("!true = " + (!t));

        System.out.println("\n6. Работа с символами:");
        char sym = 'A';
        System.out.println("Символ 'A' имеет код: " + (int) sym);

        char codeChar = 66;
        System.out.println("Символ с кодом 66: '" + codeChar + "'");

        char shifted = (char) ('A' + 1 + 1);
        System.out.println("'A' + 1 + 1 = '" + shifted + "' (символ сдвигается на 2 позиции в таблице Unicode)");
    }
}
