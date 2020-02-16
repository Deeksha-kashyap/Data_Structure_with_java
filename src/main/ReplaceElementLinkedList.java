package main;

import java.util.*;
public class ReplaceElementLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list_Strings=new LinkedList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("list of the first array:"+list_Strings);
        list_Strings.set(1,"Brown");
        System.out.println(" after remove all:"+list_Strings);
    }
}
