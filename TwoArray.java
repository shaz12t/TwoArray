import java.io.*;
import java.util.*;
public class TwoArray {
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int rows = sc.nextInt();
    int col = sc.nextInt();
    int [][] matrix = new int[rows][col];
    for(int i=0; i<rows; i++){
        for(int  j=0; j<col; j++)
        {
            matrix[i][j]=sc.nextInt();
        }}
        for(int i=0; i<rows; i++){
            for(int  j=0; j<col; j++)
            {
                System.out.println(matrix[i][j]+ " ");
            }
        System.out.println();}
    }
}
 