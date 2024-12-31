package org.abhishek.java.array.basicOperations;

import java.util.Scanner;

public class Operations {

    public static void main(String[] args) {
        //create an empty array
        int [] arr = new int[5];
        System.out.println(arr.length);

        // create an array with some initial values

         int [] prices= {20,30,40,50,60};

         // create an array of string contains fruits names
        String [] fruits = {"apple","banana","orange","grapes"};

        // take input from user
           // create an array of int which takes marks as input from user
        int [] marks = new int[5];
        Scanner input = new Scanner(System.in);

        marks[0]=input.nextInt();
        marks[1]=input.nextInt();
            marks[2]=input.nextInt();

      for (Integer mark:marks){
          System.out.println(mark);
      }
    }
}
