package main;

import java.util.*;
public class SearchLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list_Strings=new LinkedList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        list_Strings.add("Pink");
        System.out.println("Original List:"+list_Strings);
        if(list_Strings.contains("Green"))
        {
            System.out.println("Color green is present");
        }
        else
        {
            System.out.println("Color green is not present");
        }
        if(list_Strings.contains("Orange"))
        {
            System.out.println("Color orange is present");
        }
        else
        {
            System.out.println("Color orange is not present");
        }
    }
}
