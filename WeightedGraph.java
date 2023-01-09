
public class WeightedGraph {

    int V;

    int E;

    Edge [] edges;

    public WeightedGraph(int v, int e){
        this.V= v;
        this.E = e;
        this.edges = new Edge[e];

        for (int i = 0; i < e; i++) {
            edges[i] = new Edge();
        }
    }
}
