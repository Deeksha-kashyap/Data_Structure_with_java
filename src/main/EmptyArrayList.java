package main;

import java.util.*;

public class EmptyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list_Strings=new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("Original List:"+list_Strings);
        list_Strings.removeAll(list_Strings);
        System.out.println("array list after removing :"+list_Strings);
    }
}
