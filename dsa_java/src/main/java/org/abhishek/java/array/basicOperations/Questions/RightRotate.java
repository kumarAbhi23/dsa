package org.abhishek.java.array.basicOperations.Questions;


public class RightRotate {
    public  static  void  reverseArray(int[] arr, int start, int end){
        while (start<=end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    public static void rotate(int[] nums, int d) {
        int n = nums.length;
        d= d%nums.length;
        reverseArray(nums,n-d,n-1);
        reverseArray(nums,0,n-d-1);
        reverseArray(nums,0,n-1);


    }
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7};
        rotate(arr,3);
        for (Integer i:arr){
            System.out.print(i+" ");
        }

    }
}
