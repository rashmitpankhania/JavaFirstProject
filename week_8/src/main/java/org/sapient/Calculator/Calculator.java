package org.sapient.Calculator;

public class Calculator implements BasicOperations, ScientificOperations {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int div(int a, int b) throws Exception {
        if(b==0)
            throw new Exception("divide by zero");
        return a/b;
    }

    @Override
    public double sine(int deg) {
        return Math.sin(deg);
    }

    @Override
    public double cos(int deg) {
        return Math.cos(deg);
    }
}
