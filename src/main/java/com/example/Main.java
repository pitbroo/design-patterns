package com.example;

public class Main {
    public static void main(String[] args) {
        ExceptionTracker exceptionTracker = ExceptionTracker.getInstance();

        printIsErrorOrNot();
        // Simulation of some exception
        doSomethingDangerous(exceptionTracker);
        printIsErrorOrNot();
        printIsErrorOrNot();

    }

    private static void doSomethingDangerous(ExceptionTracker exceptionTracker) {
        try {
            int result = 10 / 0; // Spowoduje dzielenie przez zero i wyjątek ArithmeticException
        } catch (ArithmeticException e) {
            exceptionTracker.setExceptionOccurred(true);
            System.out.println("Wystąpił błąd");

        }
    }

    private static void printIsErrorOrNot(){
        System.out.println("Czy wysąpił błąd: "+ExceptionTracker.getInstance().hasExceptionOccurred());
        System.out.println("------------------------");
    }
}
