package ru.netology.javaqa.javaqamvn.services;
public class restService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;
        for (int month = 0; month <= 12; month++) {
            if (money > threshold) { // можем ли отдыхать?
                money = (money - expenses) / 3;
                count++; // увеличиваем счётчик месяцев отдыха
            } else {
                money = money + income - expenses;
            }
        }
        int actual = count;
        return actual;
    }
}
