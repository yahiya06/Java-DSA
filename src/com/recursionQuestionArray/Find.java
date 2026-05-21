package com.recursionQuestionArray;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr ={2,3,4,4,5,7,8,90};
        int target = 4;
        ArrayList<Integer> ans = findAll(arr, target, 0, new ArrayList<Integer>() );
        System.out.println(ans);
    }

    static ArrayList<Integer> findAll(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAll(arr,target,index+1,list);
    }
}
