package org.example.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        Queue<String> q=new PriorityQueue<>();
        Map<String,Integer> map=new HashMap<>();
        list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int position=Collections.binarySearch(list,8);
        if(position <0){
            System.out.println("Element not found");
        }
        int [] arr=new int[]{1,2,3,4,5,6,7,8,9};
        Arrays.sort(arr);
        position=Arrays.binarySearch(arr,2);
        if(position <0){
            System.out.println("Element not found");
        }
        Collections.shuffle(list);
        Collections.sort(list);
    }
}
