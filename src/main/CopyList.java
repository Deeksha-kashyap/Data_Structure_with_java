package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyList {
    public static void main(String[] args) {
        List<String> list_Strings=new ArrayList<String>();
        list_Strings.add("1");
        list_Strings.add("2");
        list_Strings.add("3");
        list_Strings.add("4");
        List<String> list_Strings1=new ArrayList<String>();
        list_Strings1.add("A");
        list_Strings1.add("B");
        list_Strings1.add("C");
        list_Strings1.add("D");
        System.out.println("List: "+list_Strings);
        Collections.copy(list_Strings,list_Strings1);
        System.out.println("Copy List1 to List: ");
        System.out.println("List1: "+list_Strings);
        System.out.println("List2: "+list_Strings1);
    }
}
