package ru.netology.stats.StatsService;

public class StatsService {

    // 4 Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму:
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // 3 Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму:
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    // 1 Сумма всех продаж:
    public long sumAllSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (sum + sales[i]);
        }
        return sum;
    }

    // 2 Средняя сумма продаж в месяц:
    public int middleSumSales(long[] sales) {
        int middleSum = 0;
        for (long m : sales) {
            middleSum += m;
        }
        return middleSum / sales.length;
    }

    // 5 Количество месяцев, в которых продажи были ниже среднего:
    public int lowSales(long[] sales) {
        int lowMonth = 0;
        for (long sale : sales) {
            if (sale < middleSumSales(sales)) {
                lowMonth += 1;
            }
        }
        return lowMonth;
    }

    // 6 Количество месяцев, в которых продажи были выше среднего
    public int highSales(long[] sales) {
        int highMonth = 0;
        for (long sale : sales) {
            if (sale > middleSumSales(sales)) {
                highMonth += 1;
            }

        }
        return highMonth;
    }
}