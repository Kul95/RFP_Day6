package com.Practice.LogicalPrograms;

import java.util.Scanner;

public class StopWatchProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long start,end;
        double time;
        System.out.println("Type character to  start stopwatch:");
        char ch=sc.next().charAt(0);
        start=System.currentTimeMillis();
        System.out.println("Type character to stop stopwatch: ");
        char ch1=sc.next().charAt(0);
        end=System.currentTimeMillis();
        time=(end-start)/1000.0;
        System.out.println(time);
    }
}
