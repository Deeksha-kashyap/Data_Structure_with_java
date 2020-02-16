package main;

import java.util.*;
public class CompareTwoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list_Strings=new LinkedList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("list of the first array:"+list_Strings);
        LinkedList<String> list_Strings1=new LinkedList<String>();
        list_Strings1.add("Red");
        list_Strings1.add("Green");
        list_Strings1.add("Orange");
        list_Strings1.add("White");
        list_Strings1.add("Black");
        System.out.println("list of the second array:"+list_Strings1);
        LinkedList<String> c3=new LinkedList<String>();
        for(String e:list_Strings)
        {
            c3.add(list_Strings1.contains(e)?"Yes":"No");
            System.out.println(c3);
        }
    }
}
