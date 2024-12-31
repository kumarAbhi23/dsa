package org.abhishek.java.array.basicOperations.Questions;

public class LargestNumber {


    public static  int largestNumber(int [] nums){
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];

        // largest value and minimum value in java
         int maxnumber = Integer.MIN_VALUE;
        // int smallest = Integer.MAX_VALUE;
         for(int i =0; i<nums.length; i++){
             if(nums[i]>maxnumber) maxnumber= nums[i];
         }
         return maxnumber;
    }
    public static void main(String[] args) {
        int arr []={10,9,20,33};
        System.out.println(largestNumber(arr));
    }
}
