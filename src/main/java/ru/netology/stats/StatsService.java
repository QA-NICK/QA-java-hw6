package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int avgSales(int[] sales) {
        return sumSales(sales) / sales.length;

    }

    public int maxMonthSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;

        }
        return maxMonth + 1;
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
        return minMonth + 1;
    }

    public int lessThenAvg(int[] sales) {
        int less = 0;
        int avg = avgSales(sales);


        for (int sale : sales) {
            if (sale < avg) {
                less = less + 1;
            }

        }
        return less;

    }

    public int moreThenAvg(int[] sales) {
        int more = 0;
        int avg = avgSales(sales);


        for (int sale : sales) {
            if (sale > avg) {
                more = more + 1;
            }

        }
        return more;

    }
}
