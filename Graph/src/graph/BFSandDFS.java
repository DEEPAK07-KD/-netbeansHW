package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSandDFS {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    
    static void dfs(int node){
        visited[node] = true;
        
        System.out.println(node + " ");
        
        for(int next : graph.get(node)){
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
    
    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        
        boolean[] visited = new boolean[graph.size()];
        
        queue.add(start);
        
        visited[start] = true;
        
        while (!queue.isEmpty()) {
           int node = queue.poll();
           
            System.out.println(node + " ");
            
            for(int next : graph.get(node)){
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number Of Vertics : ");
        int n = sc.nextInt();
        
        System.out.print("Enter Number Of Edges : ");
        int e = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        System.out.println("Enter Edge : ");
        
        for (int i = 0; i < e; i++) {
            
            int u = sc.nextInt();
            int v = sc.nextInt();
            
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        System.out.print("Enter Starting Node : ");
        int start = sc.nextInt();
        
        System.out.println("BFS Traversal : ");
        bfs(start);
        
        visited=new boolean[n];
        
        System.out.println("DFS Traversal : ");
        dfs(start);
        
    }
}
