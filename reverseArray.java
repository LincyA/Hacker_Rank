import java.io.*;
import java.util.*;
public class reverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr_i;
        int n = in.nextInt();
        int arr[] = new int[n];
        for(arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        for(arr_i=n-1; arr_i >= 0; arr_i++){
            System.out.print(arr[arr_i]+" ");
            
        }
    }
}
