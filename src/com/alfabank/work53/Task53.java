package com.alfabank.work53;

public class Task53 {
    public static void main(String[] args) {
        String str = "An information system is designed to collect, process, store";

        int firstPos = str.indexOf(" ");
        int lastPos = str.lastIndexOf( " ") + 1;
        String firstWorld = str.substring(0, firstPos);
        String lastWorld = str.substring(lastPos);
        String text = str.substring(firstPos, lastPos);

        str = lastWorld + text + firstWorld;
        System.out.println(str);
    }
}
