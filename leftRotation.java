import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class leftRotation{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int arr_size , rot_no,i,j;
        arr_size=sc.nextInt();
        rot_no=sc.nextInt();
        int arr[]=new int[arr_size];
        for(i=0;i<arr_size;i++)
            {
             arr[i]=sc.nextInt();
            }
         for(i=rot_no;i<arr_size;i++)
        {
        System.out.print(arr[i]+" ");
        }
        for(j=0;j<rot_no;j++)
        {
        System.out.print(arr[j]+" ");
        }
    }
}
