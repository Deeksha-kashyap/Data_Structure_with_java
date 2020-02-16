package main;

import java.util.*;

public class CompareTwoArray {
    public static void main(String[] args) {
        ArrayList<String> list_Strings=new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        ArrayList<String> list_Strings1=new ArrayList<String>();
        list_Strings1.add("Red");
        list_Strings1.add("Green");
        list_Strings1.add("Orange");
        list_Strings1.add("Black");
        //Storing the comparsion output in ArrayList<String>();
        ArrayList<String> c3=new ArrayList<String>();
        for(String e:list_Strings)
        {
            c3.add(list_Strings1.contains(e)?"yes":"no");
        }
        System.out.println(c3);
    }
}
