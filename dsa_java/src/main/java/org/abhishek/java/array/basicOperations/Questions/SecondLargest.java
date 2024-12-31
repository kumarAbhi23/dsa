package org.abhishek.java.array.basicOperations.Questions;

import static org.abhishek.java.array.basicOperations.Questions.LargestNumber.largestNumber;

public class SecondLargest {

    // first we need to find first largest then second

    public static  int secondLargest(int [] nums){
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];

        int firstLargest = largestNumber(nums);
        int secondLargest = Integer.MIN_VALUE;
        for(int i =0; i<nums.length; i++){
            if(nums[i]>secondLargest && nums[i]!=firstLargest){
                secondLargest= nums[i];
            }
        }
        if(secondLargest==Integer.MIN_VALUE) return -1;
        return secondLargest;

    }

    public static void main(String[] args) {
        int arr []={10,5,10};

        System.out.println(secondLargest(arr));




    }

}
