package HW_7;

public class Main {

    public static void main (String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 1);
        graph.addEdge(1, 7);
        graph.addEdge(7, 8);
        graph.addEdge(8, 9);
        graph.addEdge(9, 3);
        BreadthFirstPath bfp1 = new BreadthFirstPath(graph, 0);
        System.out.println(bfp1.pathTo(8));
        BreadthFirstPath bfp2 = new BreadthFirstPath(graph, 9);
        System.out.println(bfp2.pathTo(6));
    }

}
