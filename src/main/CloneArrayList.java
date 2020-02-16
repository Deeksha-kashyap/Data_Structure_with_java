package main;

import java.util.*;

public class CloneArrayList {
    public static void main(String[] args) {
        ArrayList<String> list_Strings=new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("Original List:"+list_Strings);
        ArrayList<String> list_Strings1=(ArrayList<String>)list_Strings.clone();
        System.out.println("cloned array list:"+list_Strings1);
    }
}
