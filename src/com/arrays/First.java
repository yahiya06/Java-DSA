package com.arrays;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println(arr[0]);

        int[] arr2 ={1,2,3,4,5};
        System.out.println(arr2[0]);

        int[] arr3 = new int[3];
        arr3[0]= 4;
        arr3[1]=6;
        System.out.println(arr3[0] +" "+ arr3[1]);

        int arr4[] = new int[5];
        //loop for enter no. in array
        for (int i=0; i< arr4.length;i++){
            arr4[i]=in.nextInt();
//            System.out.println(arr4[i]);
        }

        //loop for print the no. of array
        for(int i=0; i<arr4.length;i++){
            System.out.println(arr4[i]);
        }

        //loop for print the no. of array using foreach loop
        for(int j : arr4){
            System.out.println(j);
        }


    }
}
