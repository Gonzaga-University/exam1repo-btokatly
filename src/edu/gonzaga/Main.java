package edu.gonzaga;

class Adder {
    int val1;
    int val2;
    int val3;

    public Adder(int new_val1, int new_val2, int new_val3) {
        val1 = new_val1;
        val2 = new_val2;
        val3 = new_val3;
    }

    /*
    public int Add() {
        return val1 + val2;
    }
     */


}

public class Main {
    public static void main(String args[]) {
        System.out.println("Starting app");
        Adder adder = new Adder(10, 20, 30);

        System.out.println("App finished.");
    }
}