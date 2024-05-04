import java.util.ArrayList;

public class GraphImplementation {
    public static void main(String[] args) {
        int n = 3, m = 3;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        graph.get(1).add(2);
        graph.get(2).add(1);
        graph.get(1).add(3);
        graph.get(3).add(1);
        graph.get(2).add(3);
        graph.get(3).add(2);

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "->");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }

}
