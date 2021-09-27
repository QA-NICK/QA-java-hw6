package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {


    @Test
    void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumSales(purchases);
        assertEquals(expected, actual);

    }

    @Test
    void shouldFindMaxSale() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxMonthSales(purchases);
        assertEquals(expected, actual);

    }
    @Test
    void ShouldCalculateMinSales() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAvgSale() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.avgSales(purchases);
        assertEquals(expected, actual);

    }

    @Test
    void shouldFindCountLessThenAvg() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.lessThenAvg(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void shouldFindCountMoreThenAvg() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.lessThenAvg(purchases);
        assertEquals(expected, actual);
    }
}