package Problema10;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Set<Integer> uniqueIntegers = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            uniqueIntegers.add(num);
        }

        System.out.println(uniqueIntegers.size());
    }
}
