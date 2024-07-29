import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int x[]=new int[n];
        int i,count=1;
        for(i=0;i<n;i++)
        {
            x[i]=v.nextInt();
        }
        for(i=1;i<n;i++){
            if(x[i]!=x[i-1])
        {
            count++;
        }
        }
        System.out.println(count);
    }
}
