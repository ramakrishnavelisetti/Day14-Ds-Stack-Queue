package com.bdlz.dssq;

public class Operations {
    public static StackQueue addElement() {
        StackQueue stacklist =new StackQueue();
        stacklist.push(70);
        stacklist.push(30);
        stacklist.push(56);
        stacklist.display();
        return stacklist;
    }
    public static void peek(){
        StackQueue stacklist =new StackQueue();
        stacklist.push(70);
        stacklist.push(30);
        stacklist.push(56);
        stacklist.peek();
    }

    public static void pop(){
        System.out.println("Before Pop:");
        StackQueue stacklist =addElement();
        stacklist.pop();
        System.out.println("");
        System.out.println("After Pop:");
        stacklist.display();
    }
    public static void queueElement() {
        StackQueue stacklist =new StackQueue();
        stacklist.queue(56);
        stacklist.queue(30);
        stacklist.queue(70);
        stacklist.display();
        System.out.println("");
        stacklist.peek();
    }
    public static void dequeueElement(){
        Operations.queueElement();
        Operations.pop();
    }
}
