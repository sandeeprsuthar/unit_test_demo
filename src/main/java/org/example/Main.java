package org.example;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;
public class Main {
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Provide me a Numeric Number!");

        if(isNumeric(sc.nextLine())) {
            System.out.println("The Provided String is Numeric!");
        }else {
            System.out.println("The provided String is valid");
        }
        sc.close();
    }
    private static boolean isNumeric(String nextLine) {
        return StringUtils.isNumeric(nextLine);
    }
}