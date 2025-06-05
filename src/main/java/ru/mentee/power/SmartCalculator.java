package ru.mentee.power;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class SmartCalculator {
    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (
                UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("Умный калькулятор:");

        int a = 5, b = 3;
        long sum = a + b;
        System.out.println("Сложение: " + a + " + " + b + " = " + sum + " (тип: long)");
        // Пояснение: оба числа типа int, результат может быть больше int

        double d1 = 5.5, d2 = 2.2;
        double diff = d1 - d2;
        System.out.println("Вычитание: " + d1 + " - " + d2 + " = " + diff + " (тип: double)");
        // Пояснение: оба числа типа double, результат тоже double

        int intVal = 4;
        double dblVal = 2.5;
        double product = intVal * dblVal;
        System.out.println("Умножение: " + intVal + " * " + dblVal + " = " + product + " (тип: double)");
        // Пояснение: int преобразуется в double автоматически, результат double

        double div = 10.0 / 3;
        System.out.println("Деление: 10 / 3 = " + div + " (тип: double)");
        // Пояснение: результат сохраняет дробную часть

        int intDiv = 10 / 3;
        System.out.println("Деление целочисленное: 10 / 3 = " + intDiv + " (тип: int)");
        // Пояснение: дробная часть отбрасывается

        int mod = 10 % 3;
        System.out.println("Остаток от деления: 10 % 3 = " + mod + " (тип: int)");
        // Пояснение: возвращает остаток, тип такой же как у чисел

        double power = Math.pow(2, 10);
        System.out.println("Возведение в степень: 2^10 = " + power + " (тип: double)");
        // Пояснение: вернуть может что угодно

        System.out.println("\nОбработка особых случаев:");
        double dZero = 10.0 / 0;
        System.out.println("Попытка деления на ноль (для double): " + dZero);

        try {
            int error = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Попытка деления на ноль (для int): " + e);
        }
    }
}
