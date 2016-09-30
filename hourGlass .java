import java.io.*;
import java.util.Scanner;
public class hourGlass {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int rows = 6 ,cols = 6, minValueInArray = -9 ,elementsInHourGlass = 7;
int maxHourGlassSum = minValueInArray * elementsInHourGlass;
int matrix[][] = new int[rows][cols];
int hourGlassSum;	
for(int i=0; i < rows; i++){
        
            for(int j=0; j < cols; j++){
            
                matrix[i][j] = sc.nextInt();
            }
        }
       
        for(int i=0; i < rows; i++){
            for(int j=0; j < cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
       
        for (int i=0; i < (rows-2); i++) {
        	for (int j=0; j<(cols-2); j++) {
        		hourGlassSum = matrix[i][j]   + matrix[i][j+1]   + matrix[i][j+2] +
        									    matrix[i+1][j+1] +
        					   matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
        	if (hourGlassSum > maxHourGlassSum) {
        			
        			maxHourGlassSum = hourGlassSum;
        		}
        	}
        }
       
        System.out.println(maxHourGlassSum);

	}

}
