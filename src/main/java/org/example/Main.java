package org.example;

import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        String output = Arrays.toString(FizzBuzz.returnFizzBuzz(sc.nextInt()));
        System.out.println(output);
    }
}