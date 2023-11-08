package org.example;

public class FizzBuzz {
    public static byte[] returnFizzBuzz(int value) {
        StringBuilder sb = new StringBuilder();
        if (value % 3 == 0) {
            sb.append("Fizz");
        }
        if (value % 5 == 0) {
            sb.append("Buzz");
        }
        if (sb.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return sb.toString().getBytes();
    }
}
