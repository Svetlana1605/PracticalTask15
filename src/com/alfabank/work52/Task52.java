package com.alfabank.work52;

public class Task52 {
    public static void main(String[] args) {
        String company = "national aviation university";
//        String abr = "" + company.charAt(0);
        String abr = String.valueOf(company.charAt(0));

       abr += company.charAt(company.indexOf(' ') + 1);
       abr += company.charAt(company.lastIndexOf(' ') + 1);
        System.out.println(abr);
}
}
