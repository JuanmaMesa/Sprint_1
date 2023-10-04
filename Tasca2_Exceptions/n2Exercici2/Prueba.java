package n2Exercici2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba {
    private static Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        byte result = 0;
        boolean validData = false;
        do {
            try {
                System.out.print(message + ": ");
                result = scanner.nextByte();
                validData = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid byte.");
                scanner.nextLine(); // Consume incorrect input
            }
        } while (!validData);
        return result;
    }

    public static int readInt(String message) {
        int result = 0;
        boolean validData = false;
        do {
            try {
                System.out.print(message + ": ");
                result = scanner.nextInt();
                validData = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid integer.");
                scanner.nextLine(); // Consume incorrect input
            }
        } while (!validData);
        return result;
    }

    public static float readFloat(String message) {
        float result = 0;
        boolean validData = false;
        do {
            try {
                System.out.print(message + ": ");
                result = scanner.nextFloat();
                validData = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a floating-point number (e.g., 3.14).");
                scanner.nextLine(); // Consume incorrect input
            }
        } while (!validData);
        return result;
    }

    public static double readDouble(String message) {
        double result = 0;
        boolean validData = false;
        do {
            try {
                System.out.print(message + ": ");
                result = scanner.nextDouble();
                validData = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a floating-point number (e.g., 3.14).");
                scanner.nextLine(); // Consume incorrect input
            }
        } while (!validData);
        return result;
    }

    public static char readChar(String message) {
        System.out.print(message + ": ");
        return scanner.next().charAt(0);
    }

    public static String readString(String message) {
        System.out.print(message + ": ");
        return scanner.next();
    }

    public static boolean readYesNo(String message) {
        boolean result = false;
        boolean validData = false;
        do {
            System.out.print(message + " (y/n): ");
            String input = scanner.next().toLowerCase();
            if (input.equals("y")) {
                result = true;
                validData = true;
            } else if (input.equals("n")) {
                result = false;
                validData = true;
            } else {
                System.out.println("Please enter 'y' or 'n'.");
            }
        } while (!validData);
        return result;
    }
}
