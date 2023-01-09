import lombok.Data;
import lombok.NonNull;

@Data
public class Edge {
    @NonNull
    Integer src;
    @NonNull
    Integer dst;
    Integer weight;

    public Edge(){
        this.src=this.dst=this.weight=0;
    }

    public Edge(Integer start, Integer end, Integer w){
        this.src=start;
        this.dst = end;
        this.weight=w;
    }
}
