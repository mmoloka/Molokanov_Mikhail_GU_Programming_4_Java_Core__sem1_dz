package org.example.sem1_dz.regular;

/**
 * Класс Декоратор предназначен для вывода результата работы
 * приложения в заданном виде.
 */

public class Decorator {

    /**
     * Метод декорирует числа, добавляя их в строку при помощи
     * функции форматирования строк.
     * @param n декорируемое число
     * @param num декорируемое число
     * @return строка заданного вида
     */
    public static String decorate(int n, long num) {

        return String.format("The number of the Fibonacci sequence with ordinal number %d is %d.", n, num);
    }
}
