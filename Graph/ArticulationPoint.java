import java.util.*;
public class ArticulationPoint {
    public static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest =dest;
        }

    }

    public static void createGraph(ArrayList<Edge>[]graph){

        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
       // graph[3].add(new Edge(3,5));
        //graph[4].add(new Edge(4,5));
        graph[4].add(new Edge(4,3));
        //graph[5].add(new Edge(5,4));
        //graph[5].add(new Edge(5,3));


    }
    public static void dfs(ArrayList<Edge>[]graph, int curr, int par,int dt[], int low[], int time,boolean vis[]){
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;


        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            int neigh = e.dest;

            if(neigh == par){   // visited through neighbour
                continue;
            }
            else if(vis[neigh]){  // backedge condition
              low[curr] = Math.min(low[curr],dt[neigh]);
            }
            else {  // neighbour is unvisited
                dfs(graph, neigh, curr, dt, low, time, vis);
                low[curr] = Math.min(low[curr],low[neigh]);
                if(par != -1 && dt[curr]<= low[neigh]){
                    System.out.print("Articulation Point is"+" "+curr);
                    
                }
                children++;
               
            }
        }
        if(par == -1 && children>1){
            System.out.print("Articultion point is"+" "+curr);
        }

    }
    public static void Articulation(ArrayList<Edge>[]graph, int V){
           int dt[] = new int[V];
           int low[] = new int[V];
            int time = 0;
            boolean vis[] = new boolean[V];

            for(int i=0 ;i<V;i++){
                if(!vis[i]){
                    dfs(graph,i,-1,dt,low,time,vis);
                }
            }
    }

    public static void main(String[] args){
        int v = 5;

        ArrayList<Edge> []graph = new ArrayList[v];

        Articulation(graph, v);
    }
}
