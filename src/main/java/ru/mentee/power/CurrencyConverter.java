package ru.mentee.power;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class CurrencyConverter {

    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        final double USD_TO_RUB = 90.50;
        final double EUR_TO_RUB = 98.20;
        final double CNY_TO_RUB = 12.50;

        double usdAmount = 100.0;
        double eurAmount = 50.0;
        double cnyAmount = 250.0;
        double rubAmount = 4910.0;

        double usdToRub = usdAmount * USD_TO_RUB;
        double rubToUsd = rubAmount / USD_TO_RUB;

        double eurToRub = eurAmount * EUR_TO_RUB;
        double rubToEur = rubAmount / EUR_TO_RUB;

        double cnyToRub = cnyAmount * CNY_TO_RUB;

        double d1 = 0.1;
        double d2 = 0.2;
        double sum = d1 + d2;
        boolean isEqual = (sum == 0.3);

        System.out.println("Курсы валют:");
        System.out.println("1 USD = " + USD_TO_RUB + " RUB");
        System.out.println("1 EUR = " + EUR_TO_RUB + " RUB");
        System.out.println("1 CNY = " + CNY_TO_RUB + " RUB");

        System.out.println("\nКонвертация:");
        System.out.println("100 USD = " + usdToRub + " RUB");
        System.out.println("4910 RUB = " + rubToUsd + " USD");

        System.out.println("50 EUR = " + eurToRub + " RUB");
        System.out.println("4910 RUB = " + rubToEur + " EUR");

        System.out.println("250 CNY = " + cnyToRub + " RUB");

        System.out.println("\nДемонстрация проблемы точности с double:");
        System.out.println("0.1 + 0.2 = " + sum);
        System.out.println("(0.1 + 0.2) == 0.3? " + isEqual);
    }
}
