public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(4);

        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 3, 3);

        graph.listAllEdges();
    }
}