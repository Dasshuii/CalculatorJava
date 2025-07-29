package org.dashui;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exit = false;

        while(!exit) {
            Scanner scanner = new Scanner(System.in);
            Calculator calculator = new Calculator();

            System.out.println("[1] Addition");
            System.out.println("[2] Subtraction");
            System.out.println("[3] Multiplication");
            System.out.println("[4] Division");
            System.out.println("[5] Square Root");
            System.out.println("[6] Power of");
            System.out.println("[0] Exit");

            int opt = Integer.valueOf(scanner.nextLine());

            switch (opt) {
                case 1:
                    System.out.println("Number 1: ");
                    float num1 = Float.valueOf(scanner.nextLine());
                    System.out.println("Number 2: ");
                    float num2 = Float.valueOf(scanner.nextLine());
                    System.out.printf("Result: %d", calculator.add(num1, num2));
                case 2:
                    System.out.println("Number 1: ");
                    num1 = Float.valueOf(scanner.nextLine());
                    System.out.println("Number 2: ");
                    num2 = Float.valueOf(scanner.nextLine());
                    System.out.printf("Result: %d", calculator.subtract(num1, num2));
                case 3:
                    System.out.println("Number 1: ");
                    num1 = Float.valueOf(scanner.nextLine());
                    System.out.println("Number 2: ");
                    num2 = Float.valueOf(scanner.nextLine());
                    System.out.printf("Result: %d", calculator.multiply(num1, num2));
                case 4:
                    System.out.println("Number 1: ");
                    num1 = Float.valueOf(scanner.nextLine());
                    System.out.println("Number 2: ");
                    num2 = Float.valueOf(scanner.nextLine());
                    System.out.printf("Result: %d", calculator.divide(num1, num2));
                case 5:
                    System.out.println("Number: ");
                    num1 = Float.valueOf(scanner.nextLine());
                    System.out.printf("Result: %d", calculator.squareRoot(num1));
                case 6:
                    System.out.println("Number: ");
                    num1 = Float.valueOf(scanner.nextLine());
                    System.out.println("Power of: ");
                    num2 = Float.valueOf(scanner.nextLine());
                    System.out.printf("Result: %d", calculator.powerOf(num1, num2));
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }

        }
    }
}