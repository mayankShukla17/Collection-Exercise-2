package com.stackroute;
/*
Problem 2 : Given a number(N), generate the binary numbers from 1 to N using queue
        Create a class named BinaryNumberGenerator with the following method:
        +findBinaryNumbersSequence(int) : String
        -Should accept number as input
        -Should generate the binary numbers from 1 to N and return as a result
        -Should return "Give proper input not zero or negative" if the given number is zero or
        negative
        -Should return "Give proper input not greater than 20" if the given number is greater
        than 20
        Example
        Sample Input:
        4
        Expected Output:
        1 10 11 100
        --------------------------------------------------------
        Sample Input:
        -5
        Expected Output:
        Give proper input, not zero or negative
        --------------------------------------------------------
        Sample Input:
        44
        Expected Output:
        Give proper input not greater than 20
*/
import java.util.*;
import java.util.Queue;
public class BinaryNumberGenerator {
    //Method for Binary number generator
    public static String findBinaryNumbersSequence(int number) {
        // create an empty Queue and push 1 to it
        Queue<String> queue = new ArrayDeque<>();
        queue.add("1");
        String output="";
        // run n times
        int i = 1;
        while (i++ <= number)
        {
            // append 0 and 1 to the front element of the queue and
            // enqueue both Strings
            queue.add(queue.peek() + '0');
            queue.add(queue.peek() + '1');

            // pop the front element and print it
            output=queue.poll() + ' ';
        }
        return output;
    }

    //Main Method Code Runner
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        String output=findBinaryNumbersSequence(number);
        System.out.println(output);
    }
}
