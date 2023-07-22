import java.util.*;
public class FromTopologicalBFS {
    public static class Edge{
        int src;
        int dest;
        int weight;

        public Edge(int src,int dest, int weight){
          this.src = src;
          this.dest = dest;
          this.weight = weight;
        }

        public static void calCulateIndeg(ArrayList<Edge>[]graph, int []indeg){

        for(int i=0;i<graph.length;i++){
                   int v = i;
                   for(int j=0;j<graph[v].size();i++){
                          Edge e = graph[v].get(i);
                          indeg[e.dest]++;
                   }
            }
        }
        public static void topSort(ArrayList<Edge>[]graph){
            int indeg[] = new int[graph.length];
            calCulateIndeg(graph, indeg);
            Queue<Integer>q = new LinkedList<>();

            for(int i=0;i<indeg.length;i++){
                if(indeg[i]==0){
                    q.add(i);
                }
            }

            //bfs
            while(!q.isEmpty()){
                int curr = q.remove();
                System.out.print(curr+" ");

                for(int i=0;i<graph[curr].size();i++){
                          Edge e = graph[curr].get(i);

                          indeg[e.dest]--;
                          if(indeg[e.dest]==0){
                            q.add(e.dest);
                          }
                }
            }
            System.out.println();
        }
        public static void sourceToDest(ArrayList<Edge>[]graph, int src,int dest, String path){
              if(src == dest){
                System.out.println(path+dest);
                return ;
              }

              for(int i=0;i<graph[src].size();i++){
                Edge e = graph[src].get(i);
                sourceToDest(graph, e.dest, dest, path+src);
              }
        }
        public static void BellmannFord(ArrayList<Edge>[]graph, int src){
            int dist[] = new int[graph.length];
            for(int i=0;i<dist.length;i++){
                if(i!=src){
                    dist[i] = Integer.MAX_VALUE;
                }
            }
            int V = graph.length;
            //algo
            for(int i=0;i<V-1;i++){
                //Edges-->O(E)
                for(int j=0;j<graph.length;i++){
                    for(int k=0;k<graph[j].size();j++){
                        Edge e = graph[j].get(k);

                        int u = e.src;
                        int c = e.dest;
                        int wt = e.weight;

                        //relaxation
                        if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[V]){
                                dist[V] = dist[u]+wt;
                        }
                    }
                }
            }

            //print
            for(int i=0;i<dist.length;i++){
                System.out.print(dist[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int V= 5;
        ArrayList<Edge> []graph = new ArrayList[V];
    
        // CreationOfGraph(graph);
        // topSort(graph);

        //sourceToDest(graph, 5, 1, null);
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
       }
       Edge Graph = new Edge(0, 1, 2);
       graph[0].add(new Edge(0,1,2));
       graph[0].add(new Edge(0,2,4));
       graph[1].add(new Edge(1,2,-4));
       graph[2].add(new Edge(2,3,2));
       graph[3].add(new Edge(3,4,4));
       graph[4].add(new Edge(4,1,-1));

        Graph.BellmannFord(graph, 0);
    }
}
