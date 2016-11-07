package com.array.questions;

/**
 *  Question: 
 * Rotate an array of n elements to the right by k steps. 
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. 
 * How many different ways do you know to solve this problem? 
 *
 * Best Solution:
 * O(n) time and O(1) space
 *
 * Tips & Tricks:
 * 1. Divide the array two parts: 1,2,3,4 and 5, 6, 7
 * 2. Reverse first part: 4,3,2,1,5,6,7
 * 3. Reverse second part: 4,3,2,1,7,6,5
 * 4. Reverse the whole array: 5,6,7,1,2,3,4
 */
public class RotateArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        rotate(arr, 3);

        for(int a : arr) {
            System.out.print(a);
        }
    }

    public static void rotate(int[] arr, int order) {
        if (arr == null || arr.length==0 || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        if(order > arr.length){
            order = order % arr.length;
        }

        //length of first part
        int a = arr.length - order;

        reverse(arr, 0, a-1);
        reverse(arr, a, arr.length-1);
        reverse(arr, 0, arr.length-1);

    }

    public static void reverse(int[] arr, int left, int right) {
        if (arr == null || arr.length == 1)
            return;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

