public class Main {
    public static void main(String[] args) {
        System.out.println(" Домашняя работа 7, циклы 2, Задача 1");
        int wanted = 2_459_000;
        int total = 0;
        int monthlyFee = 15_000;
        int month = 1;
        while (total < wanted) {
            total = total + monthlyFee;
            System.out.println(" Месяц " + month + " сумма накоплений равна " + total + " рублей ");
            month++;
        }
        System.out.println(" Задача 2");
        int number = 1;
        int bound = 10;
        while (number <= bound) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (number = 10; number >= 1; number--) {
            System.out.print(number + "  ");
        }
        System.out.println();
        System.out.println(" Задача 3");
        int people = 12_000_000;
        int coefficient = 1_000;
        int fertility = 17;
        int mortaliti = 8;
        int differents = fertility - mortaliti;
        int years = 10;
        for (int year = 1; year <= years; year++) {
            people = people + people * differents / coefficient;
            System.out.println(" Год " + year + " численность населения составляет " + people);
        }
        System.out.println(" Задача 4");
        int wanted2 = 12_000_000;
        int total2 = 15_000;
        int month2 = 1;
        double percent = 0.07;
        while (total2 < wanted2) {
            total2 = total2 + (int) (total2 * percent);
            System.out.println(" Месяц " + month2 + " сумма накоплений равна " + total2 + " рублей ");
            month2++;
        }
        System.out.println(" Задача 5");
        int wanted3 = 12_000_000;
        int total3 = 15_000;
        int month3 = 1;
        double percent1 = 0.07;
        while (total3 < wanted2) {
            total3 = total3 + (int) (total3 * percent);
            if (month3 % 6 == 0) {
                System.out.println(" Месяц " + month3 + " сумма накоплений равна " + total3 + " рублей ");
            }
            month3++;
        }
        System.out.println(" Задача 6");
        int months = 9 * 12;
        int total4 = 15_000;
        double percent2 = 0.07;
        for (int month1 = 1; month1 <= months; month1++) {
            total4 = total4 + (int) (total4 * percent2);
            if (months % 6 == 0) {
                System.out.println(" Месяц " + month1 + " сумма накоплений равна " + total4 + " рублей ");
            }
        }
        System.out.println(" Задача 7");
        int firstFriday = 6;
        for (int day = 1; day <= 31; day++) {
            if (day % 7 == firstFriday) {
                System.out.println("Сегодня пятница, " + day + " -е число . Необходимо подготовить отчет");
            }
        }
        System.out.println(" Задача 8");
        int currentYear = 2023;
        int start = currentYear - 200;
        int end = currentYear + 100;
        int period = 79;
        int firstTimeAppeared = 0;
        for (int year3 = start; year3 <= end; year3++) {
            if (year3 % period == firstTimeAppeared) {
                System.out.println(year3);
            }

        }
    }

}



