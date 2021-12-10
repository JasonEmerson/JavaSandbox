package net.jason_emerson.test_classes;

import net.jason_emerson.dailies.GraphDaily;

public class TestGraph {
    public static void main(String[] args) {
        GraphDaily graph = new GraphDaily(5);
        createGraph(graph);
        //graph.bfs();
        System.out.println();
        graph.dfs();
    }

    public static void createGraph(GraphDaily g) {
        g.addVertex('a');
        g.addVertex('b');
        g.addVertex('c');
        g.addVertex('d');
        g.addVertex('e');

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
    }
}
