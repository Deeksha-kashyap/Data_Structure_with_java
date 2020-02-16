package main;

import java.util.*;
public class RemoveFirstLastLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list_Strings=new LinkedList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        list_Strings.add("Pink");
        System.out.println("Original List:"+list_Strings);
        Object first=list_Strings.removeFirst();
        System.out.println("The linked List:"+first);
        Object last=list_Strings.removeLast();
        System.out.println("The linked List:"+last);
    }
}
