package org.example;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Calculator cal= new Calculator();
        System.out.println(cal.add(BigInteger.valueOf(900019372),BigInteger.valueOf(900019372)));
    }
}