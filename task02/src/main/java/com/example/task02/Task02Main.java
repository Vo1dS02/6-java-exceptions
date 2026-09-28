package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
        System.out.println(getSeason(4));
        System.out.println(getSeason(12));

        try {
            getSeason(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Исключение перехвачено: " + e.getMessage());
        }
    }

    static String getSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            throw new IllegalArgumentException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
        }
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            return "зима";
        }
        if (monthNumber >= 3 && monthNumber <= 5) {
            return "весна";
        }
        if (monthNumber >= 6 && monthNumber <= 8) {
            return "лето";
        } else {
            return "осень";
        }

    }
}