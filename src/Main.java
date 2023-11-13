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
        float depositSum = 0.00f;
        int monthCount = 0;
        while (depositSum < depositGoal) {
            depositSum += deposit + (deposit / 100f) * 1;
            monthCount++;
            System.out.printf("Месяц " + monthCount + ", сумма накоплений равна %.2f рублей", depositSum);
            System.out.println();
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
        System.out.println();
    }

    public static void task3() {
        float population = 12_000_000.00f;
        float mortality;
        float birthRate;
        int populationRound;
        for (int year = 1; year <= 10; year++) {
            birthRate = 17f * (population / 1000);
            mortality = 8f * (population / 1000);
            population = population + birthRate - mortality; //Для точности расчета учитываю дробную часть
            populationRound = (int) population; // Количество людей не может быть не целым - округляю
            System.out.println("Год " + year + ", численность населения составляет " + populationRound);
        }
    }

    public static void task4() {
        float depositSum = 15_000.00f;
        int month = 0;
        while (depositSum <= 12_000_000.00) {
            month++;
            depositSum += (depositSum / 100f) * 7;
            System.out.printf("Месяц " + month + ", сумма накоплений равна %.2f рублей", depositSum);
            System.out.println();
        }
    }

    public static void task5() {
        float depositSum = 15_000.00f;
        int month = 0;
        while (depositSum <= 12_000_000.00) {
            month++;
            depositSum += (depositSum / 100f) * 7;
            if (month % 6 == 0) {
                System.out.printf("Месяц " + month + ", сумма накоплений равна %.2f рублей", depositSum);
                System.out.println();
            }
        }
    }

    public static void task6() {
        float depositSum = 15_000.00f;
        int month = 0;
        int monthGoal = 12 * 9;
        while (month <= monthGoal) {
            month++;
            depositSum += (depositSum / 100f) * 1;
            if (month % 6 == 0) {
                System.out.printf("Месяц " + month + ", сумма накоплений равна %.2f рублей", depositSum);
                System.out.println();
            }
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