package com.bdlz.dssq;


import java.util.Scanner;

public class StackQueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press '1' to add element at the start  ");
        switch (sc.nextInt()) {
            case 1:
            Operations.addElement();
            break;
        }
    }
}
