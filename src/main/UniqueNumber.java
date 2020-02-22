package main;

import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        for (int i = l; i <= r; i++) {
            int num = i;
            boolean visited[] = new boolean[10];
            while (num != 0) {
                if (visited[num%10])
                    break;
                visited[num % 10] = true;
                num = num / 10;
            }
            if (num == 0)
                System.out.print(i + " ");
        }
    }
}


