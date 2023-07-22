import java.util.*;
public class KosarajuAlgorithm {
    public static class Edge{
        int src;
        int dest;
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void CreateGraph(ArrayList<Edge>[]graph){
           for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
           }

           graph[0].add(new Edge(0,1));
           graph[1].add(new Edge(1,2));
           graph[2].add(new Edge(2,0));
           graph[3].add(new Edge(3,0));
           graph[4].add(new Edge(4,3));
    }

    public static void topSort(ArrayList<Edge>[]graph, int curr, boolean vis[], Stack<Integer>stack){
        vis[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]){
                topSort(graph, e.dest, vis, stack);
            }
        }
        
        stack.push(curr);
        
    }
    public static void dfs(ArrayList<Edge>[]graph, int curr, boolean vis[]){
        vis[curr] = true;
        System.out.print(curr+" ");
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
    }

    public static void Kosaraju(ArrayList<Edge> graph[], int V){
        Stack<Integer>s = new Stack<>();
        boolean vis[] = new boolean[V];

        // Step1
        for(int i=0;i<V;i++){
               if(!vis[i]){
                topSort(graph, i, vis, s);
               }
        }

        //Step2 creating transpose graph
        ArrayList<Edge>[]transpose = new ArrayList[V];

        for(int i=0;i<graph.length;i++){
            vis[i] = false;
            transpose[i] = new ArrayList<>();
        }

        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);

                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        // Step 3 remove from stack

        while(!s.empty()){
            int curr = s.pop();
            if(!vis[curr]){
                dfs(transpose,curr,vis);
                System.out.println();
            }
        }
    }

    public static void main(String args[]){
            int v=5;
            ArrayList<Edge> graph[] = new ArrayList[v];
            CreateGraph(graph);

            Kosaraju(graph, v);
    }
    
}
