package finserv.dayfour.defaultandstatic;

interface MathOperations {
    static int add(int a, int b) {
        return a + b;
    }
    static int multiply(int a, int b) {
        return a * b;
    }
}