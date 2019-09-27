package com.company;

import java.util.Scanner;

public class Time {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a,b,c;
        a=n/3600;
        c=n%3600;
        b=0;
        for (a=a;a>12; a=a-12);
        if (c>60) {
            b=c/60;
            c=c%60;
        }
        if (b>60) {
            a = a + (b / 60);
            b=b%60;
        }
        System.out.println(a+":"+b+":"+c);
    }
}
