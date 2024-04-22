import java.util.*;
public class Solution {
    public static int[][] pascalTriangle(int N) {
        // Write your code here.
        int[][] triangle = new int[N][];
        
        for (int i = 0; i < N; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = triangle[i][i] = 1; // first and last element of each row is 1
            
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j]; // calculate middle elements
            }
        }
        
        return triangle;
    }
}