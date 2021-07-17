package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task6();
        //task7();
        //task8();
        //task9();
        //task10();
        //task11();
    }

    private static void task4() {
        final int I = 20, N = 20;
        Random r = new Random();

        int k, f;
        double x = 0, z = 0, y = 0;

        for (int i = 1; i <= I; i++) {
            y = 0;
            f = 1;
            x = r.nextDouble() * 100;
            for (k = 1; k <= N; k++) {
                f *= k;
                y += Math.pow(x, k) / f;
            }
            z += y;
        }

        System.out.println("Z = " + z);
    }

    private static void task6() {
        final int MAX_VALUE = 100;
        int x, y, k, n = 0;

        for (x = 1; x <= MAX_VALUE; x++) {
            for (y = 1; y <= MAX_VALUE; y++) {
                for (k = 1; k <= MAX_VALUE; k++) {
                    n++;
                    if (x * x + y * y == k * k)
                        System.out.printf("%3d^2 + %3d^2 = %3d^2\n", x, y, k);
                }
            }
        }
        System.out.println(n);
    }

    private static void task8() {
        final int D = 13, H = 17,C = 500;
        int number = C + 1;
        for (int n = 0; n < 20; ) {
            if (number % D == 0 || number % H == 0) {
                System.out.print(number + " ");
                n++;
            }
            number++;
        }
    }

    private static void task7() {
        final int D = 19, C = 100;
        int number = C + 1;
        for (int n = 0; n < 15; ) {
            if (number % D == 0) {
                System.out.print(number + " ");
                n++;
            }
            number++;
        }

        System.out.println();
        number = C + 1;
        int n = 0;
        while (n < 15) {
            if (number % D == 0) {
                System.out.print(number + " ");
                n++;
            }
            number++;
        }
    }

    private static void task9() {
        final int Z = 12;
        int n = 1, a = 2, b = 4, number = a;

        do {
            number += b;
            n++;
        } while (number <= Z);
        System.out.println("нужно взять членов прогрессии: " + n);
    }

    private static void task11() {
        System.out.println("Прямоугольнник" + System.lineSeparator());
        final int N = 6, M = 5;
        for (int c = 0; c < N; c++) {
            System.out.println();
            for (int i = 0; i < M; i++) {
                System.out.print("*");
            } }
        System.out.println("\nпрямоугольный треугольник\n");
        for (int row = 0; row < N; row++) {
            for (int column = 0; column < N - row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\nравносторонний треугольник" + System.lineSeparator());
        for (int column = 0; column < N; column++) {
            System.out.print(" ");
        }
        System.out.println("*");
        for (int row = 0; row < N; row++) {
            for (int column = 0; column < N - row; column++) {
                System.out.print(" ");
            }
            for (int column = 0; column < (row + 1) * 2; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void task10 () {
        int x = 1;
        int i = 1;
        int sum = 0;
        for (i = 1; x <= 5; i += 4) {
            x++;
            sum += i;
            if (x == 5) {

                System.out.println(i);
            }
        }
        System.out.println(sum);
    }

    private static void task3 () {
        Scanner in = new Scanner(System.in);
        int number = 0, a = 0, b = 0, digits = (int) Math.ceil(Math.log10(number)), mod = 0,
                counterA = 0, counterB = 0;
        System.out.printf("Введите нчисло а:");
        a = in.nextInt();
        System.out.printf("Введите число b:");
        b = in.nextInt();
        System.out.printf("Введите натуральное число:");
        number = in.nextInt();
        int number1 = number;
        for (int i = 0; i < digits; i++) {
            System.out.print(" " + (mod = number % 10));
            number /= 10;
            if (mod == a)
                counterA++;
            else if (mod == b)
                counterB++;
        }
        System.out.printf("%sВерно, что цифра %d встречается в нем реже, чем цифра %d",
                (counterA < counterB ? "" : "НЕ "), a, b);
        counterA = counterB = 0;
    }


    private static void task2 () {
        double a = 3, b = -5;
        for (double x = 1; x <= 5; x += 0.5) {
            System.out.println(a * x * x + b);
        }
    }

    private static void task1 () {
        Scanner in = new Scanner(System.in);
        int a, b, h = 0;
        System.out.println("Введите a:");
        a = in.nextInt();
        System.out.println("Введите b:");
        b = in.nextInt();
        System.out.println("Введите шаг h:");
        h = in.nextInt();
        System.out.println("---------------------");
        System.out.println("F(x)=x-sin(x)");
        for (int i = a; i <= b; i += h) {
            System.out.println(i + "  " + (i - Math.sin(i)));
        }
        System.out.println("---------------------");
        System.out.println("F(x)=sin(x)^2");
        for (int i = a; i <= b; i += h) {
            System.out.println(i + "  " + (Math.sin(i) * Math.sin(i)));
        }
        System.out.println("---------------------");
        System.out.println("F(x)=2*cos(x)-1");
        for (int i = a; i <= b; i += h) {
            System.out.println(i + "  " + (2 * Math.cos(i) - 1));
        }

    }

}