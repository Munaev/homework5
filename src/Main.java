public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
    }

    private static void task11() {
        System.out.println("Задача12");
        int table = 0;
        for (int i = 1; i <= 10; i++) {
            table = i * 2;
            System.out.println("2 * " + i + " = " + table);
        }
    }

    private static void task10() {
        System.out.println("Задача11");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
            System.out.println(total);
        }
    }

    private static void task9() {
        System.out.println("Задача10");
        int salary = 65523;
        int total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + " Итого " + total);
            System.out.println(total);
        }
    }

    private static void task8() {
        System.out.println("Задача9");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    private static void task7() {
        System.out.println("Задача8");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    private static void task6() {
        System.out.println("Задача6");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }

    private static void task5() {
        System.out.println("Задача5");
        for (int i = 2020; i < 2070; i = i + 4) {
            System.out.println("Високосный год " + i);
        }
    }

    private static void task4() {
        System.out.println("Задача4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    private static void task3() {
        System.out.println("Задача3");
        for (int i = 0; i <=17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void task1() {
        System.out.println("Задача2");
        for (int i = 10; i >= 0; i--) {
            System.out.println("Интеграция цикла " + i);
        }
    }

    private static void task2() {
        System.out.print("Задача1");
        for (int i = 0; i < 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
    }



}


