package Medium;

import java.util.*;

public class SuspiciousMethodsRemover {

    public static List<Integer> remainingMethods(int n, int k, int[][] invoke) {
        List<Integer>[] graph = new ArrayList[n];
        List<Integer>[] reverseGraph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
            reverseGraph[i] = new ArrayList<>();
        }

        for (int[] cur_el : invoke) {
            int caller = cur_el[0];
            int callee = cur_el[1];
            graph[caller].add(callee);
            reverseGraph[callee].add(caller);
        }

        boolean[] suspicious = new boolean[n];
        findSuspiciousMethods(graph, k, suspicious);

        for (int i = 0; i < n; i++) {
            if (!suspicious[i]) {
                for (int callee : graph[i]) {
                    if (suspicious[callee]) {
                        return allMethods(n);
                    }
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!suspicious[i]) {
                result.add(i);
            }
        }

        return result;
    }

    private static List<Integer> allMethods(int n) {
        List<Integer> allMethods = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            allMethods.add(i);
        }
        return allMethods;
    }

    private static void findSuspiciousMethods(List<Integer>[] graph, int k, boolean[] suspicious) {
        if (suspicious[k]) {
            return;
        }

        suspicious[k] = true;

        for (int callee : graph[k]) {
            findSuspiciousMethods(graph, callee, suspicious);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] invocations = new int[m][2];

        for (int i = 0; i < m; i++) {
            invocations[i][0] = scanner.nextInt();
            invocations[i][1] = scanner.nextInt();
        }

        List<Integer> result = remainingMethods(n, k, invocations);
        System.out.println(result);

        scanner.close();
    }
}
