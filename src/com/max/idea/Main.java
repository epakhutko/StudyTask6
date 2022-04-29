package com.max.idea;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in).useLocale(Locale.ENGLISH);;

        System.out.println("Input 2 numbers:");
        double x = inp.nextDouble();
        double y = inp.nextDouble();
        char c = inp.next().charAt(0);
        double r=0;
        switch (c) {
            case '+':
                r = x + y;
                break;
            case '-':
                r = x - y;
                break;
            case '*':
                r = x * y;
                break;
            case '/':
                if (y==0) {
                    System.out.println("Divide by 0 exception");
                    return;
                }
                else {
                    r = x / y;
                    break;
                }

        }


        System.out.println("Result: ");
        System.out.printf("%f\n", r);

        return;

    }
}