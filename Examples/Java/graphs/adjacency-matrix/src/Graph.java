import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    int dijkstra(int src, int dest) {
        int[] dist = new int[n];
        int[] parent = new int[n];
        Boolean[] sptSet = new Boolean[n];

        for (int i = 0; i < n; i++) {
            dist[i] = INF;
            parent[i] = -1;
            sptSet[i] = false;
        }

        dist[src] = 0;

        for (int count = 0; count < n - 1; count++) {
            int u = minDistance(dist, sptSet);

            if (u == -1) {
                break;
            }
            if (u == dest) {
                break;
            }

            sptSet[u] = true;

            for (int v = 0; v < n; v++) {
                if (!sptSet[v] && matrix[u][v] != INF && dist[u] != INF && dist[u] + matrix[u][v] < dist[v]) {
                    dist[v] = dist[u] + matrix[u][v];
                    parent[v] = u;
                }
            }
        }

        if (dist[dest] != INF) {
            System.out.print("Path from " + src + " to " + dest + ": ");
            printPath(parent, dest);
            System.out.println();
        } else {
            System.out.println("No path from " + src + " to " + dest);
        }

        return dist[dest];
    }

    private int minDistance(int[] dist, Boolean[] sptSet) {
        int min = INF, min_index = -1;

        for (int v = 0; v < n; v++) {
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
        }
        return min_index;
    }

    private void printPath(int[] parent, int j) {
        if (parent[j] == -1) {
            System.out.print(j);
            return;
        }

        printPath(parent, parent[j]);
        System.out.print(" -> " + j);
    }
}