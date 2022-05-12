public class Graph {
    boolean[] visited;
    boolean[] onPath;
    void traverse(Graph graph,int s){
        if (visited[s]) return;
        visited[s] = true;
        onPath[s] = true;
    }
}
