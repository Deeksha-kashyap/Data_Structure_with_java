package main;

import java.util.*;

public class JoinArrayList {
    public static void main(String[] args) {
        ArrayList<String> list_Strings=new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("list of the first array:"+list_Strings);
        ArrayList<String> list_Strings1=new ArrayList<String>();
        list_Strings1.add("Red");
        list_Strings1.add("Green");
        list_Strings1.add("Orange");
        list_Strings1.add("White");
        list_Strings1.add("Black");
        System.out.println("list of the second array:"+list_Strings1);
        ArrayList<String> a=new ArrayList<String>();
        a.addAll(list_Strings);
        a.addAll(list_Strings1);
        System.out.println("New Array:"+a);
    }
}
