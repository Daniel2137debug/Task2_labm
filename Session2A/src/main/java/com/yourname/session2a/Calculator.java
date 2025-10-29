package com.yourname.session2a;

public class Calculator {
    public int sum(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public int divide(int a, int b) { return b == 0 ? -1 : a / b; }
}
