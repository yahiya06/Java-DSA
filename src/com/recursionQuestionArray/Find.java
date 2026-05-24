package com.recursionQuestionArray;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr ={1,2,4,4};
        int target = 4;
//        ArrayList<Integer> ans = findAll(arr, target, 0, new ArrayList<Integer>() );
//        System.out.println(ans);

        System.out.println(findAll2(arr,target,0));
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


    static ArrayList<Integer> findAll2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls =  findAll2(arr,target,index+1);

        list.addAll(ansFromBelowCalls);
        return list;
    }
}
