package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public int averageSales(int[] sales) {
        return sumSales(sales) / sales.length;
    }


    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    public int minSalesMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }


    public int monthsBelowAverage(int[] sales) {
        int average = averageSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }


    public int monthsAboveAverage(int[] sales) {
        int average = averageSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}