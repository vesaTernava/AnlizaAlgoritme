import lombok.Data;
import lombok.NonNull;

@Data
public class BellmanFordRequest {
    @NonNull
    WeightedGraph graph;
    @NonNull
    Integer source;

    public int[] solve(){

        int V = graph.V, E = graph.E;
        int[] dist = new int[V];

        for (int i = 0; i < V; ++i)
            dist[i] = Integer.MAX_VALUE;
        dist[source] = 0;


        for (int i = 1; i < V; ++i) {
            for (int j = 0; j < E; ++j) {
                int u = graph.edges[j].src;
                int v = graph.edges[j].dst;
                int weight = graph.edges[j].weight;
                if (dist[u] != Integer.MAX_VALUE
                        && dist[u] + weight < dist[v])
                    dist[v] = dist[u] + weight;
            }
        }


        for (int j = 0; j < E; ++j) {
            int u = graph.edges[j].src;
            int v = graph.edges[j].dst;
            int weight = graph.edges[j].weight;
            if (dist[u] != Integer.MAX_VALUE
                    && dist[u] + weight < dist[v]) {
                System.out.println(
                        "Graph contains negative weight cycle");
                return null;
            }
        }


        return dist;
    }


}
