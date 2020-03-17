package main;

import java.io.*;
import java.util.*;

public class SalesGraph
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int T=0;T<t;T++)
        {
            int n=scan.nextInt();
            int m=0;
            int arr[]=new int[1000];
            for(int i=0;i<n;i++)
            {
                arr[i]=scan.nextInt();
                m=Math.max(m,arr[i]);
            }
            System.out.println(m);
            for(int i=m;i>=1;i--)
            {
                for(int j=0;j<n;j++)
                {
                    if( arr[j] >=i)
                        System.out.printf("%s ","|");
                    else System.out.printf("%s","  ");
                }
                System.out.println("  ");
            }
        }
    }
}
