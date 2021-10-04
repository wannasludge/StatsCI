package ru.netology.CI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatCI service = new StatCI();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
    @Test
    void findMaxFirstZero(){
        StatCI service = new StatCI();
        long[] incomesInBillions = {0, 14, 8, 9, 0, 3, 8, 6, 5, 11, 1};
        long expected = 14;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}