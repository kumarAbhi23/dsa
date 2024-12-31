package org.abhishek.java.array.basicOperations.Questions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateSorted {

    public static int removeDuplicates(int[] nums) {

        /* approach 1- using set ds - bruteforce
        Set<Integer> set = new HashSet<>();
        for(int i =0; i<nums.length; i++){
            set.add(nums[i]);
        }
        return set.size();
        - nlogn - insert into set
        - n space
         */


        // using two pointer approach
        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
       return i+1;

    }
    public static void main(String[] args) {

        int  nums []= {1,1,2,3,3,4};
        System.out.println(removeDuplicates(nums));

    }
}
