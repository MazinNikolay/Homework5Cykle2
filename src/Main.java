public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
        System.out.println();
        hardWork1();
        System.out.println();
        hardWork2();
        System.out.println();
    }

    public static void task1() {
        int depositGoal = 2_459_000;
        int deposit = 15_000;
        double depositSum = 0.00;
        int monthCount = 0;
        while (depositSum < depositGoal) {
            depositSum += deposit * 1.01;
            monthCount++;
            System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + depositSum + " рублей");
        }
    }

    public static void task2() {
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            if (i == 10) {
                break;
            } else i++;
        }
        System.out.println();
        for (; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        int population = 12_000_000;
        int mortality = 8;
        int birthRate;
        for (int year = 1; year <= 10; year++) {
            birthRate = 17 * (population / 1000);
            population = population + birthRate - mortality;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        int depositSum = 15_000;
        int month = 0;
        while (depositSum <= 12_000_000) {
            month++;
            depositSum *= 1.07;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + depositSum + " рублей");
        }
    }

    public static void task5() {
        int depositSum = 15_000;
        int month = 0;
        while (depositSum <= 12_000_000) {
            month++;
            depositSum *= 1.07;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений равна " + depositSum + " рублей");
        }
    }

    public static void task6() {
        int depositSum = 15_000;
        int month = 0;
        int monthGoal = 12 * 9;
        while (month <= monthGoal) {
            month++;
            depositSum *= 1.07;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений равна " + depositSum + " рублей");
        }
    }

    public static void task7() {
        int firstFriday = 6;
        int currentDay = 1;
        while (currentDay < 31) {
            if ((currentDay - firstFriday) % 7 == 0)
                System.out.println("Сегодня пятница, " + currentDay + "-е число. Необходимо подготовить отчет");
            currentDay++;
        }
    }

    public static void task8() {
        int dateStart = 2023 - 200;
        int dateEnd = 2023 + 100;
        while (dateStart <= dateEnd) {
            if (dateStart % 79 == 0) System.out.println(dateStart);
            dateStart++;
        }
    }

    public static void hardWork1() {
        int val = 1;
        while (val <= 30) {
            if (val % 3 == 0 && val % 5 != 0) {
                System.out.println(val + " ping");
            } else if (val % 3 != 0 && val % 5 == 0) {
                System.out.println(val + " pong");
            } else if (val % 3 == 0 && val % 5 == 0) {
                System.out.println(val + " ping pong");
            } else System.out.println(val);
            val++;
        }
    }

    public static void hardWork2() {
        int valFirst = 0;
        int valSecond = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(valFirst + " " + valSecond + " ");
            valFirst = valSecond + valFirst;
            valSecond = valFirst + valSecond;
        }
    }
}