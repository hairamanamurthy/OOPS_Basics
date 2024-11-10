package org.example.streams;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> li= Arrays.asList(2,4,5,1,5,3,9,7);
        HashSet<Integer> hs=new HashSet<>(li);
        li=new ArrayList<>(hs);
        List<Integer> ms=new ArrayList<>();
        for(int i=0;i<li.size();i++){
            int num=li.get(i);
            if(num%2==0){
                ms.add(num*num);
            }
        }
        Collections.sort(ms);
        for(int num: ms)
            System.out.println(num);
    }
    //Using streams

//    List<Integer> li1= Arrays.asList(2,4,5,1,5,3,9,7);
//    li1.stream()
//            .filter
}
