public class Main {

    public static void main(String[] args)
    {
        int V = 5;
        int E = 8;

        WeightedGraph graph = new WeightedGraph(V, E);

        graph.edges[0].src = 0;
        graph.edges[0].dst = 1;
        graph.edges[0].weight = -1;

        graph.edges[1].src = 0;
        graph.edges[1].dst = 2;
        graph.edges[1].weight = 4;

        graph.edges[2].src = 1;
        graph.edges[2].dst = 2;
        graph.edges[2].weight = 3;

        graph.edges[3].src = 1;
        graph.edges[3].dst = 3;
        graph.edges[3].weight = 2;

        graph.edges[4].src = 1;
        graph.edges[4].dst = 4;
        graph.edges[4].weight = 2;

        graph.edges[5].src = 3;
        graph.edges[5].dst = 2;
        graph.edges[5].weight = 5;

        graph.edges[6].src = 3;
        graph.edges[6].dst = 1;
        graph.edges[6].weight = 1;

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
