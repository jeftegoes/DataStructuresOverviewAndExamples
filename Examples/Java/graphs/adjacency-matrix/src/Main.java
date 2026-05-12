public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(4);

        graph.addEdge(0, 1, 2);
        graph.addEdge(1, 3, 1);
        graph.addEdge(0, 2, 5);
        graph.addEdge(2, 3, 2);
        graph.addEdge(1, 2, 3);

        graph.listAllEdges();

        System.out.println(graph.dijkstra(0, 3));
    }
}