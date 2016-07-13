package com.example.javabasics;

import java.io.Console;
import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String firstName;
        boolean isInvalidWord;
        do {
            System.out.print("Enter name: ");
            firstName = in.nextLine();
            isInvalidWord = firstName.equalsIgnoreCase("dork") ||
                                    firstName.equalsIgnoreCase("jerk");
            if (isInvalidWord ) {
                System.out.println("That language is not allowed. Try again. \n");
            }
        } while (isInvalidWord);

        System.out.print("Enter age: ");
        Byte age = Byte.parseByte(in.nextLine());
        in.close();

        if (age < 13) {
            System.out.println("Sorry you must be at least 13 to use this program");
            System.exit(0);
        }

        String fs,sc;
        fs = String.format("Hi, my name is %s and i'm %d.\n",firstName,age);
        sc = String.format("%s is learning how to write Java.",firstName);
        System.out.print(fs);
        System.out.print(sc);
    }
}
