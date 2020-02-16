package main;

import java.util.*;

public class IterateLinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> list_Strings=new LinkedList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        list_Strings.add("Pink");
        //  System.out.println("Original List:"+list_Strings);
        Iterator p=list_Strings.listIterator(1);
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
}
