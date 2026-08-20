package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixandList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number Of Vertics : ");
        int n = sc.nextInt();
        
        System.out.print("Enter Number Of Edge : ");
        int e = sc.nextInt();
        
        int[][] matrix = new int[n][n];
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        
        System.out.println("Enter Edge : ");
        
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            
            matrix[u][v] = 1;
            matrix[v][u] = 1;
            
            list.get(u).add(v);
            list.get(v).add(u);
            
        }
        System.out.println("Adjacency Matrix : ");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Adjacency List : ");
        for (int i = 0; i < n; i++) {
            System.out.print(i+" -> ");
            
            for(int node : list.get(i)){
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}
