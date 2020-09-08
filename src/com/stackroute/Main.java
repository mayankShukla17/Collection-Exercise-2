package com.stackroute;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of Queue you want");
        int size=scanner.nextInt();
        Queue mQueue=new Queue(size);
        mQueue.enQueue(45);
        mQueue.enQueue(56);
        mQueue.enQueue(85);
        System.out.println(mQueue.size());
        System.out.println(mQueue);
        System.out.println(mQueue.deQueue());
        System.out.println(mQueue.deQueue());
        System.out.println(mQueue);
    }
}
