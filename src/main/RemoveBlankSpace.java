package main;

import java.util.Scanner;

public class RemoveBlankSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=" ";
        for(int i=0;i<s.length();i++)
        {
            s1=s1+s.charAt(i);
            if(s.charAt(i)==' ')
            {
                while(s.charAt(i+1)==' ')
                {
                    i++;
                }
            }
        }
        System.out.println(s1);
    }
}
