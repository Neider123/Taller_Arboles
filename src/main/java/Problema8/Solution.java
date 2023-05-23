package Problema8;
import java.util.*;

class Solution {
    static class Operation {
        String type;
        int value;

        public Operation(String type, int value) {
            this.type = type;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Operation> operations = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            if (type.equals("insert")) {
                int value = scanner.nextInt();
                operations.add(new Operation("insert", value));
            } else if (type.equals("getMin")) {
                int value = scanner.nextInt();
                operations.add(new Operation("getMin", value));
            } else if (type.equals("removeMin")) {
                operations.add(new Operation("removeMin", 0));
            }
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        List<String> result = new ArrayList<>();

        for (Operation operation : operations) {
            if (operation.type.equals("insert")) {
                heap.offer(operation.value);
                result.add("insert " + operation.value);
            } else if (operation.type.equals("getMin")) {
                int min = heap.isEmpty() ? -1 : heap.peek();
                if (min != operation.value) {
                    while (!heap.isEmpty() && heap.peek() < operation.value) {
                        heap.poll();
                        result.add("removeMin");
                    }
                    if (heap.isEmpty() || heap.peek() > operation.value) {
                        heap.offer(operation.value);
                        result.add("insert " + operation.value);
                    }
                }
                result.add("getMin " + operation.value);
            } else if (operation.type.equals("removeMin")) {
                if (heap.isEmpty()) {
                    heap.offer(1);
                    result.add("insert 1");
                }
                heap.poll();
                result.add("removeMin");
            }
        }

        System.out.println(result.size());
        for (String op : result) {
            System.out.println(op);
        }
    }
}
