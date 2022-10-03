package ru.netology.stats;

public class StatsService {
    public int amountSales(int[] sale) {
        int totalSale = 0;
        for (int s : sale) {
            totalSale += s;
        }
        return totalSale;
    }

    public int averageAmountSales(int[] sale) {
        return amountSales(sale) / 12;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth;
    }

    public int maxSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth;
    }

    public int salesMinMonth(int[] sale) {
        int average = amountSales(sale);
        int total = 0;
        for (int s : sale) {
            if (s < average) {
                total++;
            }
        }
        return total;

    }

    public int salesMaxMonth(int[] sale) {
        int average = amountSales(sale);
        int total = 0;
        for (int s : sale) {
            if (s > average) {
                total++;
            }
        }
        return total;
    }
}