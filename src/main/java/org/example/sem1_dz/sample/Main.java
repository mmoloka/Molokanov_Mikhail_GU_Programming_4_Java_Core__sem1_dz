package org.example.sem1_dz.sample;

import org.example.sem1_dz.regular.Decorator;
import org.example.sem1_dz.regular.Fibonacci;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int n = 500;
        long [] mem = new  long[n + 1];

        Arrays.fill(mem, -1);

        System.out.println(Decorator.decorate(n, Fibonacci.fibEffective(n)));
        System.out.println(Decorator.decorate(n, Fibonacci.fibMemo(n, mem)));
    }
}
