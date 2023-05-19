package org.example.sem1_dz.regular;

/**
 * Класс Фибоначчи предназначен для нахождения числа последовательности чисел Фибоначчи
 * по его порядковому номеру различными способами.
 */

public class Fibonacci {

    /**
     * Метод эффективного нахождения n-го числа последовательности Фибоначчи.
     *
     * @param n порядковый номер числа последовательности
     * @return n-е число последовательности Фибоначчи
     */
    public static  long fibEffective(int n) {
        long [] arr = new  long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }

    /**
     * Метод нахождения n-го числа последовательности Фибоначчи с помощью
     * рекурсии и мемоизации.
     *
     * @param n порядковый номер числа последовательности
     * @param mem массив длиною n, каждый элемент которого равен -1
     * @return n-е число последовательности Фибоначчи
     */
    public static  long fibMemo(int n, long[] mem) {
        if (mem[n] != -1) {
            return  mem[n];
        }

        if(n <= 1)
            return n;

        long result = fibMemo(n - 1, mem) + fibMemo(n - 2, mem);
        mem[n] = result;

        return  result;
    }
}
