package main;
import java.util.*;
public class RecursiveBinarySearch {
    int binarySearch(int a[], int l, int h, int x)
    {
        if (h >= l) {
            int mid = l + (h - l) / 2;
// If the element is present at the middle itself
            if (a[mid] == x)
                return mid;
// If element is smaller than mid, then it can only be present in left subarray
            if (a[mid] >x)
                return binarySearch(a, l, mid - 1, x);
// Else the element can only be present in right subarray
            return binarySearch(a, mid + 1, h, x);
        }
// We reach here when element is not present in array
        return -1;
    }
    public static void main(String args[])
    {
        RecursiveBinarySearch ob = new RecursiveBinarySearch();
        int a[] = { 20, 30, 40, 10, 50 };
        int n = a.length;
        int x = 40;
        int res = ob.binarySearch(a, 0, n - 1, x);
        if (res == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + res);
    }
}
