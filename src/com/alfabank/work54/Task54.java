package com.alfabank.work54;

public class Task54 {
    public static void main(String[] args) {
        String str1 = "Cartoon";
        String str2 = "Tomcat";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int position = 0;
        while (position < str1.length()) {
            char ch = str1.charAt(position);
            if (str2.indexOf(ch) == -1) {
                System.out.print(ch + " ");
            }
            position++;
        }
    }
}
