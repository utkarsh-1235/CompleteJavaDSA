import java.util.*;
public class CreationOfGraph{
   public static class Edge{
     int src;
     int dest;
     int weight;

     Edge(int src, int dest, int weight){
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
    public static void bfs(ArrayList<Edge>[]graph){
        Queue<Integer> q = new LinkedList<>();
        boolean []vis = new boolean[graph.length];
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();

            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr] = true;
            }
            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);

                q.add(e.dest);
            }
        }
    }
    public static boolean haspath(ArrayList<Edge>[]graph, int src, int dest, boolean vis[]){
        if(src == dest){
            return true;
        }
        vis[src] = true;
        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            if(!vis[e.dest] && haspath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }
    public static void dfs(ArrayList<Edge>[]graph, int curr, boolean []vis){
        //visited
        System.out.print(curr+" ");
        vis[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
    }
    public static void BFS(ArrayList<Edge>[]graph){
        boolean []vis = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                bfsUtil(graph,vis);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge>[] graph, boolean []vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();

            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr] = true;
                for(int i=0;i<graph[curr].size();i++){
                      Edge e = graph[curr].get(i);
                      q.add(e.dest);
                }
            }
        }
    }

    public static void DFS(ArrayList<Edge>[]graph){
        boolean []vis = new boolean[graph.length];

        for(int i = 0;i<graph.length;i++){
            
                dfsUtil(graph,i,vis);
            }
        }
    
    public static void dfsUtil(ArrayList<Edge>[]graph,int curr,boolean[]vis){
        //visited
        System.out.print(curr+" ");
        vis[curr] = true;
         for(int i=0;i<graph[curr].size();i++){
            Edge  e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfsUtil(graph,e.dest,vis);
            }
         }
    }
    public static boolean detectCycle(ArrayList<Edge>[]graph){
        boolean []vis = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(detectCycleUtil(graph,vis,i,-1)){
                    return true;
                    //Cycle exits in one of the parts
                }
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge>[]graph, boolean[]vis, int curr, int parent){
            
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            //Case3 
            if(!vis[e.dest]){
                if(detectCycleUtil(graph, vis, e.dest, curr)){
                    
                    return true;
                }
            }

            //case1
            else if(vis[e.dest] && e.dest != parent){
                     return true;
            }

            //case 2 do nothing --> continue

        }
        return false;
    }

    public static boolean isBipartite(ArrayList<Edge>[]graph){
            int col[] = new int[graph.length];

            for(int i = 0;i<col.length;i++){
                col[i] = -1;
            }
            Queue<Integer> q = new LinkedList<>();
            for(int i=0;i<col.length;i++){
                if(col[i] == -1){ // BFS
                  q.add(i);
                  while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0;j<graph[curr].size();j++){
                             Edge e = graph[curr].get(j);

                             if(col[e.dest] == -1){
                                int nextCol = col[curr] == 0?1:0;
                                col[e.dest] = nextCol;

                                q.add(e.dest);
                             }
                             else if(col[e.dest] == col[curr]){
                                return false; // not bipartite
                             }
                    }
                  }
                }
            }
             return true;
    }
    public static boolean directedIsCycle(ArrayList<Edge>[]graph){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(directedIsCycleUtil(graph,i,vis,stack)){
                    return true;
                }
            }
        }
            return false;
    }

    public static boolean directedIsCycleUtil(ArrayList<Edge>[]graph, int curr, boolean vis[], boolean stack[]){
        vis[curr] = true;
        stack[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){ // cycle
                     return true;
            }
            if(!vis[e.dest]&& directedIsCycleUtil(graph, e.dest, vis, stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    public static void topologicalSort(ArrayList<Edge>[]graph){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topSortUtil(graph,i,vis,st);

            }
        }
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }

    public static void topSortUtil(ArrayList<Edge>[]graph, int curr, boolean []vis, Stack<Integer>st){
               vis[curr] = true;
               for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                if(!vis[e.dest]){
                    topSortUtil(graph, e.dest, vis, st);
                }
               }
                st.push(curr);
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

            for(int i=0;i<graph.length;i++){
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
              System.out.print(path+dest+" ");
              return ;
            }

            for(int i=0;i<graph[src].size();i++){
              Edge e = graph[src].get(i);
              sourceToDest(graph, e.dest, dest, path+src);
            }
      }
      
       static class pair implements Comparable<pair>{
        int n;
        int path;
        pair(int n, int path){
            this.n = n;
            this.path = path;
        }
        @Override
        public int compareTo(pair p2){
            return this.path-p2.path;  // path based sorting 
        }
      }
     public static void dijkstraS(ArrayList<Edge>[]graph,int src){
        int dist[] = new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(i!=src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        PriorityQueue<pair>pq = new PriorityQueue<>();
        boolean vis[] = new boolean[graph.length];

        pq.add(new pair(src,0));

        //loop
        while(!pq.isEmpty()){
            pair curr = pq.remove();
            if(!vis[curr.n]){
                vis[curr.n] = true;

                //neighbours
                for(int i=0;i<graph[curr.n].size();i++){
                     Edge e = graph[curr.n].get(i);
                     int u = e.src;
                     int v = e.dest;
                     int wt = e.weight;

                     if(dist[u]+wt < dist[v]){
                          dist[v] = dist[u]+wt;
                          pq.add(new pair(v,dist[v]));
                     }
                }
            }
        }

    // print all distance
    for(int i=0;i<dist.length;i++){
        System.out.print(dist[i]+" ");
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
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    Edge e = graph[j].get(k);

                    int u = e.src;
                    int v = e.dest;
                    int wt = e.weight;

                    //relaxation
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                            dist[v] = dist[u]+wt;
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

    static class Pair implements Comparable<Pair>{
        int v;
        int cost;
        public Pair(int v, int cost){
          this.v = v;
          this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost-p2.cost;
        }
    }
    public static void Prims(ArrayList<Edge>[]graph){
              boolean [] vis = new boolean[graph.length];
              PriorityQueue<Pair> pq = new PriorityQueue<>();
              pq.add(new Pair(0,0));
              int finalCost = 0;// mST cost total min weight

              while(!pq.isEmpty()){
                Pair curr = pq.remove();
                if(!vis[curr.v]){
                    vis[curr.v] = true;
                    finalCost += curr.cost;

                    for(int i=0;i<graph[curr.v].size();i++){
                        Edge e = graph[curr.v].get(i);
                        pq.add(new Pair(e.dest,e.weight));
                    }
                }
              }
              System.out.println("Final Cost of Mst using prim's algorithm is"+" "+finalCost);
    }
   }
public static void main(String args[]){
 int V = 5;
ArrayList<Edge>[]graph = new ArrayList[V] ;

for(int i=0;i<V;i++){
    graph[i] = new ArrayList<>();
}
//  graph[0].add(new Edge(0, 1, 5));

//  //graph[1].add(new Edge(1,0,5));
//  graph[1].add(new Edge(1,2,1));
//  //graph[1].add(new Edge(1,3,3));

//  //graph[2].add(new Edge(2,1,1));
//  graph[2].add(new Edge(2,3,1));
//  //graph[2].add(new Edge(2,4,2));

//  //graph[3].add(new Edge(3,1,3));
//  graph[3].add(new Edge(3,4,1));

 //graph[4].add(new Edge(4,2,2));
//  graph[4].add(new Edge(4,5,1));

//  graph[5].add(new Edge(5,4,1));
//  graph[5].add(new Edge(5,3,1));
//  graph[5].add(new Edge(5,6,1));


//  graph[6].add(new Edge(6,5,1));

 

 // 1's neighbours
//  for(int i=0;i<graph[1].size();i++){
//     Edge e = graph[1].get(i);
//     System.out.print(e.src+" ");
//     System.out.print(e.dest+" ");
//     System.out.print(e.weight+" ");
//     System.out.println();
//  }
// System.out.println();
// // 2's neighbours

// for(int i=0;i<graph[2].size();i++){
//     Edge e = graph[2].get(i);
//     System.out.print(e.src+" ");
//     System.out.print(e.dest+" ");
//     System.out.print(e.weight+" ");
//     System.out.println();

// }

// System.out.println();

// //3's neighbours
// for(int i =0;i<graph[3].size();i++){
//     Edge e = graph[3].get(i);
//     System.out.print(e.src+" ");
//     System.out.print(e.dest+" ");
//     System.out.print(e.weight+" ");
//     System.out.println();
// }

// System.out.println();

// //4's neighbours
// for(int i=0;i<graph[4].size();i++){
//     Edge e = graph[4].get(i);
//     System.out.print(e.src+" ");
//     System.out.print(e.dest+" ");
//     System.out.print(e.weight+" ");
//     System.out.println();
// }
 Edge Graph = new Edge(0,1,2);
 //Graph.bfs(graph);
 //Graph.dfs(graph, 0, new boolean[V]);

 //System.out.println(Graph.haspath(graph, 0, 8, new boolean[V]));
 //Graph.BFS(graph);
//  System.out.println();
//  Graph.DFS(graph);
//  System.out.println();
//  Graph.dfs(graph,0,new boolean[V]);

//System.out.println(Graph.detectCycle(graph));
//System.out.println(Graph.isBipartite(graph));
 //System.out.println(Graph.directedIsCycle(graph));
 //Graph.topologicalSort(graph);
 //Graph.topSort(graph);


//  graph[0].add(new Edge(0,1,2));
//  graph[0].add(new Edge(0,2,4));
//  graph[1].add(new Edge(1,2,1));
//  graph[1].add(new Edge(1,3,7));
//  graph[2].add(new Edge(2,4,3));
//  graph[3].add(new Edge(3,5,1));
//  graph[4].add(new Edge(4,3,2));
//  graph[4].add(new Edge(4,5,5));

    //   graph[0].add(new Edge(0,1,2));
    //    graph[0].add(new Edge(0,2,4));
    //    graph[1].add(new Edge(1,2,-4));
    //    graph[2].add(new Edge(2,3,2));
    //    graph[3].add(new Edge(3,4,4));
    //    graph[4].add(new Edge(4,1,-1));

//        Graph.BellmannFord(graph, 0);

//  graph[5].add(new Edge(5,0));
//  graph[5].add(new Edge(5,2));
 //Graph.sourceToDest(graph, 5, 1, "");
 //Graph.topSort(graph);
 //Graph.dijkstraS(graph, 0);

 graph[0].add(new Edge(0,1,10));
 graph[0].add(new Edge(0,2,15));
 graph[1].add(new Edge(1,0,10));
 graph[1].add(new Edge(1,3,40));
 graph[2].add(new Edge(2,0,15));
 graph[2].add(new Edge(2,3,50));
 graph[3].add(new Edge(3,0,30));
 graph[3].add(new Edge(3,1,40));
 graph[3].add(new Edge(3,2,50));

Graph.Prims(graph);
}
}