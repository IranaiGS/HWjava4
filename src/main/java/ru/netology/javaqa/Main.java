package ru.netology.javaqa;

public class Main {
    public static void main(String[] args) {
        RestService service = new RestService();
        int income;
        int expenses;
        int threshold;
        int count = service.calculate(income = 100_000, expenses = 60_000,threshold = 150_000);

        System.out.println("Количество месяцев отдыха " + count);
    }
}