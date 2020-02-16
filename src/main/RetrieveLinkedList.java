package main;

import java.util.*;
public class RetrieveLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list_Strings=new LinkedList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        list_Strings.add("Pink");
        System.out.println("Original List:"+list_Strings);
        String x=list_Strings.peekFirst();
        System.out.println("First element List:"+x);
        System.out.println("The linked List :"+list_Strings);
    }
}
