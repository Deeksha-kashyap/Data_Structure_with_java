package main;

import java.util.Scanner;

public class RatMaze {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int m=sc.nextInt();
        //int n=sc.nextInt();
        int maze[][] ={{ 1 ,0, 0, 0},{1 ,1 ,0, 1},{0 ,1, 0, 0},{1 ,1 ,1 ,1 }};
        int i=0,j=0;
        while(i<=4 && j<=4)
        {
            if(i+1<4 && j+1<4)
            {
                if(maze[i][j+1]==0 && maze[i+1][j]==1)
                {
                    System.out.printf("[%d][%d]->",i,j+1);
                    j++;
                }
                else if(maze[i+1][j]==0 && maze[i][j+1]==1)
                {
                    System.out.printf("[%d][%d]->",i+1,j);
                    i++;
                }
                else if(maze[i+1][j]==0 && maze[i][j+1]==0)
                {
                    System.out.printf("[%d][%d]->",i+1,j);
                    maze[i][j+1]=0;
                    i++;
                }
                else
                {
                    break;
                }
            }
        }
    }
}
