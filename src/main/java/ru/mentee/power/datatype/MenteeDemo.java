package ru.mentee.power.datatype;


import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class MenteeDemo {
    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (
                UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        Mentee[] mentees = {
                new Mentee("Иван", "Иванов", 20, 4.2, 2),
                new Mentee("Мария", "Петрова", 19, 4.8, 1),
                new Mentee("Петр", "Сидоров", 21, 3.9, 5),
        };

        for (Mentee m : mentees) {
            m.displayInfo();
            System.out.println("Отличник? " + (m.isExcellent() ? "Да" : "Нет"));
            System.out.println("Стипендия: " + m.calculateScholarship() + " руб.");
            boolean advanced = m.advanceToNextLevel();
            System.out.println("Повышение уровня: " + (advanced ? "Да" : "Нет"));
            System.out.println("Текущий уровень: " + m.getLevel());
            System.out.println("Стипендия: " + m.calculateScholarship() + " (" + m.getAverageGrade() + ")");
            System.out.println("------------------------------------------------");
        }
    }
}