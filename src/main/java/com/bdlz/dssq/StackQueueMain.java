package com.bdlz.dssq;


import java.util.Scanner;

public class StackQueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add element at the start");
        System.out.println("Enter 2 to show the peek element");
        System.out.println("Enter 3 to show the pop");
        switch (sc.nextInt()) {
            case 1:
                Operations.addElement();
                break;
            case 2:
                Operations.peek();
                break;
            case 3:
                Operations.pop();
                break;
        }
    }
}
