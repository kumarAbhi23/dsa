package org.abhishek.java.array.basicOperations.Questions;

import static java.util.Collections.reverse;

public class LeftRotate {


    public  static int[] leftRotateByOne(int[] arr) {
        int temp = arr[0];
        for(int i =1; i<arr.length-1; i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
    public  static  void  reverseArray(int[] arr, int start, int end){
        while (start<=end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }

    public static void leftRotated(int [] nums, int d){
        // first we need to calculate d

        d= d%nums.length;
        reverseArray(nums,0,d-1);
        reverseArray(nums,d,nums.length-1);
        reverseArray(nums,0,nums.length-1);
    }
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7};
       // System.out.println(leftRotateByOne(arr));
        leftRotated(arr,3);

        for (Integer i:arr){
            System.out.print(i+" ");
        }

    }
}
