/*
 *  UCF COP3330 Summer 2021 Assignment 7 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex07;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        String lengthS = in.nextLine();
        int lengthI = Integer.parseInt(lengthS);

        Scanner in2 = new Scanner(System.in);
        System.out.print("What is the width of the room in feet? ");
        String widthS = in2.nextLine();
        int widthI = Integer.parseInt(widthS);

        String outputString = "You entered dimensions of " + lengthS + " feet by " + widthS + " feet.";
        System.out.println(outputString);

        final float conversion = 0.09290304f;

        int sqf = lengthI * widthI;

        float sqm = sqf * conversion;

        System.out.format("The area is\n%d square feet\n%.3f square meters", sqf, sqm);
    }
}