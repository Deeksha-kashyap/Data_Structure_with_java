package main;

import java.util.*;

public class GetLastFirstOccurrence {
    public static void main(String[] args) {
        LinkedList<String> list_Strings=new LinkedList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        list_Strings.add("Pink");
        System.out.println("Original List:"+list_Strings);
        Object first_element=list_Strings.getFirst();
        System.out.println("The first linked List:"+first_element);
        Object last_element=list_Strings.getLast();
        System.out.println("The last linked List:"+last_element);
    }
}
