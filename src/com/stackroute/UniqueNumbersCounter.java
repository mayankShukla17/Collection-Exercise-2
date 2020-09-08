package com.stackroute;
/*
Problem 1 : Given an array of numbers, find the maximum count of unique numbers in a
        subarray of a given length using Dequeue.
        Create a class named UniqueNumbersCounter with the following method:
        +findUniqueNumbersCount(int[],int) : String
        -Should accept int array of numbers, length of subarray as input
        -Should find the maximum count of unique numbers in a subarray of a given length
        -Should return "Give proper input not empty array" if the given array is empty
        -Should return "Give proper input not a null array" if the given array is null
        -Should return "Give proper input, sub-array length exceeds array length" if the length
        of the subarray is greater than the length of the array
        -Should return "Give proper input, sub-array length can not be negative or zero" if
        given sub-array length is zero or negative
        -Should return "Count of Unique Numbers is 2" if the count of unique numbers in a
        subarray of a given length is 2
        Example
        Sample Input:
        array = {4,5,2,1,2}
        sub array length = 3
        Expected Output:
        Count of Unique Numbers is 3
        --------------------------------------------------------
        Sample Input:
        array = {6,10,4,5,2,1,2}
        sub array length = 7
        Expected Output:
        Count of Unique Numbers is 6
        --------------------------------------------------------
        Sample Input:
        array = {6,10,4,5,2,1,2}
        sub array length = 10
        Expected Output:
        Give proper input, sub array length exceeds array length
        --------------------------------------------------------
        Sample Input:
        array = {7,10,2,1,2}
        sub array length = -4
        Expected Output:
        Give proper input, sub-array length can not be negative or zero
*/
import java.util.*;
public class UniqueNumbersCounter {
    //Method for Counting Unique Numbers
    public static String findUniqueNumbersCount(int[] array,int size) {
        if(array.length==0){
            return "Give proper input not empty array";
        }
        else if(array==null)
            return "Give proper input not null array";
        else if(size>array.length){
            return "Give proper input, sub-array length exceeds array length";
        }
        else if(size<=0){
            return "Give proper input, sub-array length can not be negative or zero";
        }
        Deque<Integer> count=new ArrayDeque<>();
        for (int i = 0; i < size; i++) {
            if(count.contains(array[i])){
                count.remove(array[i]);
            }else{
                count.add(array[i]);
            }
        }
        return "The unique number count is "+count.size();
    }

    //Main Method Code Runner
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=scanner.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements to be inserted in array");
        for (int i = 0; i <size; i++) {
            array[i]=scanner.nextInt();
        }
        System.out.println("Enter the subarray");
        int subarray=scanner.nextInt();
        String output=findUniqueNumbersCount(array, subarray);
        System.out.println(output);
    }
}
