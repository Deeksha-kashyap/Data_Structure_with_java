package main;

import java.util.*;

public class PositionArrayList {
    public static void main(String[] args) {
        ArrayList<String> list_Strings=new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("Original List:"+list_Strings);
        System.out.println("Print using index of an element:");
        int no_of_element=list_Strings.size();
        for(int index=0;index<no_of_element;index++)
            System.out.println(list_Strings.get(index));
    }
}
