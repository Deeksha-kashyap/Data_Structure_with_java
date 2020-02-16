package main;
import java.util.*;
public class SpecificPosition {
    public static void main(String[] args) {
        LinkedList<String> list_Strings=new LinkedList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        list_Strings.add("Pink");
        System.out.println("Original List:");
        LinkedList<String> list=new LinkedList<String>();
        list.add("white");
        list_Strings.addAll(1,list);
        //list_Strings.addFirst("white");
        // list_Strings.offerLast("yellow");
        System.out.println("The linked List:"+list_Strings);
    }
}
