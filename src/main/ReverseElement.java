package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseElement {
    public static void main(String[] args) {
        List<String> list_Strings=new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("List before reverse:\n"+list_Strings);
        Collections.reverse(list_Strings);
        System.out.println("List after reverse:\n"+list_Strings);
    }
}
