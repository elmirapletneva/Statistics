package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void totalSalesMonth() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedResult = 180;
        int actualResult = service.amountSales(month);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void averageSalesAmountMonth() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedResult = 15;
        int actualResult = service.averageAmountSales(month);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void minQuantitySalesMonth() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedResult = 8;
        int actualResult = service.minSales(month);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void maxQuantitySalesMonth() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedResult = 7;
        long actualResult = service.maxSales(month);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void salesBelowAverageMonth() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedResult = 7;
        long actualResult = service.maxSales(month);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}