package com.omoto.sample;

import java.util.*;
public class RemoveDuplicate {

    public static void main(String args[]){
        int arr[] = {1,2,2,5,5};

        System.out.print(removeDupilicate(arr));
    }

    public static Set<Integer> removeDupilicate(int[] arr){
        Set<Integer> setInt= new HashSet<Integer>();
        for(int i=0;i< arr.length;i++){

            setInt.add(arr[i]);

        }
        return setInt;
    }
}
