package by.epam.lesson4.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double[] arr = new double[3];
        arr[0] = inputNumber();
        arr[1] = inputNumber();
        arr[2] = inputNumber();

        conversionArray(arr);

        viewConversionArray(arr);
    }

    public static double inputNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your number = ");
        double number;
        while (!scanner.hasNextDouble()){
            scanner.nextLine();
            System.out.println("Invalid input!");
        }
        number = scanner.nextDouble();

        return number;
    }

    public static double[] conversionArray(double[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0) {
                arr[i] = Math.pow(arr[i], 2);
            }
            else {
                arr[i] = Math.pow(arr[i], 4);
            }
        }
        return arr;
    }

    public static void viewConversionArray(double[] arr) {
        System.out.print("Conversion array = ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

