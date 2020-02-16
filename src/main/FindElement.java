package main;
import java.util.*;
public class FindElement {
    public static void main(String[] args) {
        List<String> list_Strings=new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
	/*	System.out.println(list_Strings);
	    list_Strings.add(0,"Pink");
	    list_Strings.add(5,"Yellow");
	    System.out.println(list_Strings);
	    String element=list_Strings.get(0);
	    System.out.println("First element:"+element);
	    element=list_Strings.get(2);
	    System.out.println("Third element:"+element);

	    list_Strings.set(2,"Yellow");
	    System.out.println(list_Strings);
	    for(String element:list_Strings)
	    {
	       System.out.println(element);
	    }
	    list_Strings.remove(2);
	    System.out.println("After removing third element from the list:"+list_Strings);*/
        if(list_Strings.contains("Red")){
            System.out.println("Found the element");
        }
        else{
            System.out.println("There is no such element");
        }
    }
}
