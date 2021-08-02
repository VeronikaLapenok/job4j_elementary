package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        percent = percent / 100;
        amount = amount + amount * percent;
        while (amount > 0) {
            double debt = amount - salary;
            amount = debt * percent + debt;
            year++;
        }
        return year;
    }
}
