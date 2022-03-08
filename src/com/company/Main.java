package com.company;

public class Main {

    public static void main(String[] args) {
        MyDate date = new MyDate();

        //Test New Year
        date.MyDate(31,12,2022);
        System.out.println(date);
        date.setToNextDay();
        System.out.println(date);

        //Test Leap Year
        System.out.println("");
        date.MyDate(29,2,2024);
        System.out.println(date);
        date.setToNextDay();
        System.out.println(date);
    }
}
