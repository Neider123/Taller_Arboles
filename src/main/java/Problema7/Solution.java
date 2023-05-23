package Problema7;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
        
        // Crear un mapa para almacenar los puntajes y sus índices correspondientes
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(score[i], i);
        }
        
        // Ordenar los puntajes en orden descendente
        Arrays.sort(score);
        
        // Asignar los rangos de los atletas
        for (int i = n - 1; i >= 0; i--) {
            int index = map.get(score[i]);
            
            if (i == n - 1) {
                result[index] = "Gold Medal";
            } else if (i == n - 2) {
                result[index] = "Silver Medal";
            } else if (i == n - 3) {
                result[index] = "Bronze Medal";
            } else {
                result[index] = String.valueOf(n - i);
            }
        }
        
        return result;
    }
}