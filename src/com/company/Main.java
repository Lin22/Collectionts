package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*List<String>list1= Arrays.asList("yellow","red","green","blue");
        Collections.reverse(list1);
        System.out.println(list1);
        List<String>list2=Arrays.asList("yellow","red", "green",  "blue");
        Collections.shuffle(list2);
        System.out.println(list2);*/

        /*Collection<String> collection1=Arrays.asList("red","cyan");
        Collection<String> collection2=Arrays.asList("red","blue");
        Collection<String> collection3=Arrays.asList("pink","tan");
        System.out.println(Collections.disjoint(collection1,collection2));
        System.out.println(Collections.disjoint(collection1,collection3));*/


        Collection<String>collection=Arrays.asList("red", "cyan", "red");
        System.out.println(Collections.frequency(collection,"red"));

    }}

