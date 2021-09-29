package net.jason_emerson.test_classes;

import net.jason_emerson.data_structures.Graph;

public class TestGraph {
    public static void main(String[] args)
    {
        Graph theGraph = new Graph();
        theGraph.addVertex('A'); // 0 (start for dfs)
        theGraph.addVertex('B'); // 1
        theGraph.addVertex('C'); // 2
        theGraph.addVertex('D'); // 3
        theGraph.addVertex('E'); // 4
        theGraph.addEdge(0, 1); // AB
        theGraph.addEdge(1, 2); // BC
        theGraph.addEdge(0, 3); // AD
        theGraph.addEdge(3, 4); // DE
        System.out.print("DFS visits: ");
        theGraph.dfs();
        System.out.println();
        System.out.print("BFS visits: ");
        theGraph.bfs();
        System.out.println();
    }
}
