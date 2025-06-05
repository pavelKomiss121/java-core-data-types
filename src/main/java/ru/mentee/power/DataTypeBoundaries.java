package ru.mentee.power;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class DataTypeBoundaries {
    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (
                UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("Границы типов данных в Java:");
        System.out.println("byte: от " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);
        System.out.println("short: от " + Short.MIN_VALUE + " до " + Short.MAX_VALUE);
        System.out.println("int: от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        System.out.println("long: от " + Long.MIN_VALUE + " до " + Long.MAX_VALUE);
        System.out.println("float: от " + Float.MIN_VALUE + " до " + Float.MAX_VALUE);
        System.out.println("double: от " + Double.MIN_VALUE + " до " + Double.MAX_VALUE);
        System.out.println("char: от " + (int) Character.MIN_VALUE + " до " + (int) Character.MAX_VALUE);

        System.out.println("\nДемонстрация переполнения:");

        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Максимальное значение byte: " + maxByte);

        byte overflowed = (byte) (maxByte + 1);
        System.out.println("После прибавления 1: " + overflowed);
    }
}
