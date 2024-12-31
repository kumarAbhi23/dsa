package org.abhishek.java.array.basicOperations.Questions;

public class SortedRotated {
    public static boolean check(int[] nums) {
        if(nums.length==0) return true;
        int count =0;

        for(int i =1; i<nums.length; i++){
            if(nums[i-1]>nums[i]) count++;

        }
        if(nums[nums.length-1]>nums[0]) count++;

        if(count ==0 || count==1) return true;
        else return false;



    }
    public static void main(String[] args) {
        int arr []= {1,2,3,4,5};
        System.out.println(check(arr));
    }
}
