package main;

import java.util.*;

public class InsertSpecifiedElement {
    public static void main(String[] args) {
        LinkedList<String> list_Strings=new LinkedList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        list_Strings.add("Pink");
        System.out.println("Original List:");
        System.out.println("let add the yellow color after the red color:"+list_Strings);
        list_Strings.add(1,"Yellow");
        System.out.println("The linked List:"+list_Strings);
    }
}
