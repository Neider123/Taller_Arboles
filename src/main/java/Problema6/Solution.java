package Problema6;
import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Crear una lista de adyacencia para representar el grafo
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        // Usar DFS (Búsqueda en profundidad) para encontrar una ruta desde la fuente hasta el destino
        boolean[] visited = new boolean[n];
        return dfs(graph, visited, source, destination);
    }
    
    private boolean dfs(List<List<Integer>> graph, boolean[] visited, int current, int destination) {
        // Si el vértice actual es el destino, se encontró una ruta válida
        if (current == destination) {
            return true;
        }
        
        visited[current] = true;
        
        // Recorrer todos los vecinos del vértice actual
        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor]) {
                if (dfs(graph, visited, neighbor, destination)) {
                    return true;
                }
            }
        }
        
        return false;
    }
}