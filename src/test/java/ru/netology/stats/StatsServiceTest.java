package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void sumSales() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.sumSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void averageSales() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.averageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void maxSalesMonth() {
        StatsService service = new StatsService();
        int expected = 8; // август (20 тысяч) — последний месяц с максимумом
        int actual = service.maxSalesMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void minSalesMonth() {
        StatsService service = new StatsService();
        int expected = 9; // сентябрь (7 тысяч) — последний месяц с минимумом
        int actual = service.minSalesMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthsBelowAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthsBelowAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthsAboveAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthsAboveAverage(sales);
        assertEquals(expected, actual);
    }
}