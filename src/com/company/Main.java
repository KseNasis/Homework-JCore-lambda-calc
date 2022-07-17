package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(5, 2);
        int b = calc.minus.apply(10,8);
        int c = calc.devide.apply(a, b);
        int d = calc.multiply.apply(a, b);
        int e = calc.pow.apply(d);
        int f = calc.abs.apply(c);
        int g = calc.devide.apply(5, 0);

        System.out.println(calc.isPositive.test(e));

        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(e);
        calc.println.accept(f);

    }
}
