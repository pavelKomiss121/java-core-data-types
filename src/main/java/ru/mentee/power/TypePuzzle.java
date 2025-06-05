package ru.mentee.power;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class TypePuzzle {
    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (
                UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("Головоломка 1: Сравнение чисел с плавающей точкой");

        double x = 0.3;
        double y = 0.6;
        double expected = 0.9;

        System.out.println("0.3 + 0.6 == 0.9 ? " + (x + y == expected));
        System.out.println("Фактически: 0.3 + 0.6 = " + (x + y));

        boolean accurate = Math.abs((x + y) - expected) < 1e-9;
        System.out.println("Решение (Math.abs): " + accurate);
        System.out.println();

        System.out.println("Головоломка 2: Переполнение");

        short maxShort = Short.MAX_VALUE;
        short overflowedShort = (short) (maxShort + 2);
        System.out.println("Short.MAX_VALUE + 2 = " + overflowedShort);
        System.out.println("Объяснение: переполнение, результат становится отрицательным");
        System.out.println("Решение: использовать int или контролировать границы");
        System.out.println();

        System.out.println("Головоломка 3: Поведение char");

        char ch1 = 'X';
        char ch2 = '!';
        int sumChars = ch1 + ch2;
        System.out.println("'X' + '!' = " + sumChars + " (88 + 33)");

        String concatChars = "" + ch1 + ch2;
        System.out.println("\"\" + 'X' + '!' = \"" + concatChars + "\"");
        System.out.println("Объяснение: без строки символы складываются как числа (int)");
        System.out.println();

        System.out.println("Головоломка 4: Сравнение строк");

        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println("s1 == s2: " + (s1 == s2));

        System.out.println("Объяснение: s2 создается через новый объект в памяти → false");

        System.out.println("Правильное сравнение строк:");
        System.out.println("s1.equals(s2): " + s1.equals(s2));


    }
}
