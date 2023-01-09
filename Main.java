public class Main {

    public static void main(String[] args)
    {
        int V = 5; // Number of vertices in graph
        int E = 8; // Number of edges in graph

        WeightedGraph graph = new WeightedGraph(V, E);

        // add edge 0-1 (or A-B in above figure)
        graph.edges[0].src = 0;
        graph.edges[0].dst = 1;
        graph.edges[0].weight = -1;

        // add edge 0-2 (or A-C in above figure)
        graph.edges[1].src = 0;
        graph.edges[1].dst = 2;
        graph.edges[1].weight = 4;

        // add edge 1-2 (or B-C in above figure)
        graph.edges[2].src = 1;
        graph.edges[2].dst = 2;
        graph.edges[2].weight = 3;

        // add edge 1-3 (or B-D in above figure)
        graph.edges[3].src = 1;
        graph.edges[3].dst = 3;
        graph.edges[3].weight = 2;

        // add edge 1-4 (or B-E in above figure)
        graph.edges[4].src = 1;
        graph.edges[4].dst = 4;
        graph.edges[4].weight = 2;

        // add edge 3-2 (or D-C in above figure)
        graph.edges[5].src = 3;
        graph.edges[5].dst = 2;
        graph.edges[5].weight = 5;

        // add edge 3-1 (or D-B in above figure)
        graph.edges[6].src = 3;
        graph.edges[6].dst = 1;
        graph.edges[6].weight = 1;

        // add edge 4-3 (or E-D in above figure)
        graph.edges[7].src = 4;
        graph.edges[7].dst = 3;
        graph.edges[7].weight = -3;

        BellmanFordRequest bellmanFordRequest = new BellmanFordRequest(graph, 0);
        int[] result = bellmanFordRequest.solve();
        printSolution(result, V);

    }
    public static void printSolution(int[] d, int V){
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < V; ++i)
            System.out.println(i + "\t\t" + d[i]);
    }
}
