package com.alfabank.work55;

import java.util.Scanner;

public class Task55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text -> ");
        String text = sc.nextLine();

        int index = 0;
        while (index < text.length()) {
            char ch = text.charAt(index);
            if (text.indexOf(ch) == text.lastIndexOf(ch)) {
                System.out.printf( "%2c", ch);
            }
            index++;
        }
    }
}
