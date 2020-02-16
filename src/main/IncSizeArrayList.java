package main;

import java.util.*;

public class IncSizeArrayList {
    public static void main(String[] args) {
        ArrayList<String> list_Strings=new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        System.out.println("Original List:"+list_Strings);
        list_Strings.ensureCapacity(6);
        list_Strings.add("White");
        list_Strings.add("pink");
        list_Strings.add("yellow");
        System.out.println("New array list :"+list_Strings);
    }
}
