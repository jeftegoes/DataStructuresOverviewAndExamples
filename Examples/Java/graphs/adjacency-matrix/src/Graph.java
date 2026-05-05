public class Graph {
    int[][] matrix;
    int n;
    final int INF = 999999;

    Graph(int n) {
        this.n = n;
        matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = INF;
            }
        }
    }

    void addEdge(int u, int v, int weight) {
        matrix[u][v] = weight;
    }

    void listAllEdges() {
        for (int u = 0; u < n; u++) {
            for (int v = 0; v < n; v++) {
                if (matrix[u][v] != INF) {
                    System.out.println(u + " -> " + v + " (w=" + matrix[u][v] + ")");
                }
            }
        }
    }
}