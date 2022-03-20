package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int sum = new Main().getSum("Hans");
        System.out.println("This is your name as a number: " + sum);
    }

    public int getSum(String name){
        //Enter your name between the quotation marks
        name = name.toUpperCase();
        int sum = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'A') {
                sum = sum + 1;
            }
            if (name.charAt(i) == 'B') {
                sum = sum + 2;
            }
            if (name.charAt(i) == 'C') {
                sum = sum + 3;
            }
            if(name.charAt(i) == 'D'){
                sum = sum + 4;
            }
            if(name.charAt(i) == 'E'){
                sum = sum + 5;
            }
            if(name.charAt(i) == 'F'){
                sum = sum + 6;
            }
            if(name.charAt(i) == 'G'){
                sum = sum + 7;
            }
            if(name.charAt(i) == 'H'){
                sum = sum + 8;
            }
            if(name.charAt(i) == 'I'){
                sum = sum + 9;
            }
            if(name.charAt(i) == 'J'){
                sum = sum + 10;
            }
            if(name.charAt(i) == 'K'){
                sum = sum + 11;
            }
            if(name.charAt(i) == 'L'){
                sum = sum + 12;
            }
            if(name.charAt(i) == 'M'){
                sum = sum + 13;
            }
            if(name.charAt(i) == 'N'){
                sum = sum + 14;
            }
            if(name.charAt(i) == 'O'){
                sum = sum + 15;
            }
            if(name.charAt(i) == 'P'){
                sum = sum + 16;
            }
            if(name.charAt(i) == 'Q'){
                sum = sum + 17;
            }
            if(name.charAt(i) == 'R'){
                sum = sum + 18;
            }
            if(name.charAt(i) == 'S'){
                sum = sum + 19;
            }
            if(name.charAt(i) == 'T'){
                sum = sum + 20;
            }
            if(name.charAt(i) == 'U'){
                sum = sum + 21;
            }
            if(name.charAt(i) == 'V'){
                sum = sum + 22;
            }
            if(name.charAt(i) == 'W'){
                sum = sum + 23;
            }
            if(name.charAt(i) == 'X'){
                sum = sum + 24;
            }
            if(name.charAt(i) == 'Y'){
                sum = sum + 25;
            }
            if(name.charAt(i) == 'Z'){
                sum = sum + 26;
            }
        }
        return sum;
    }
}
