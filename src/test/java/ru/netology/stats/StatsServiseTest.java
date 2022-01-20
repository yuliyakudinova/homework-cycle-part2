package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiseTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        StatsServise servise = new StatsServise();
        long expected = 180;

        long actual = servise.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSum() {
        StatsServise servise = new StatsServise();
        long expected = 15;

        long actual = servise.calculateAverageSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        StatsServise servise = new StatsServise();

        long expected = 8;

        long actual = servise.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        StatsServise servise = new StatsServise();

        long expected = 9;

        long actual = servise.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void belowAverage() {
        StatsServise servise = new StatsServise();

        long expected = 5;

        long actual = servise.belowAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void aboveAverage() {
        StatsServise servise = new StatsServise();

        long expected = 5;

        long actual = servise.aboveAverage(sales);

        assertEquals(expected, actual);
    }
}