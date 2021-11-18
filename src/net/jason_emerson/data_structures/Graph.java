package net.jason_emerson.data_structures;

public class Graph {
    private final int MAX_VERTS = 20;
    private Vertex[] vertexList;
    private int[][] adjMat;
    private int vCount ;
    private Stack theStack;
    private Queue theQueue;

    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        vCount = 0;
        for(int j = 0; j < MAX_VERTS; j++)
            for(int k = 0; k < MAX_VERTS; k++)
                adjMat[j][k] = 0;
        theStack = new Stack(MAX_VERTS);
        theQueue = new Queue(MAX_VERTS);
    }

    public void addVertex(char lab) {
        vertexList[vCount++] = new Vertex(lab);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    private void displayVertex(int v) {
        System.out.print(vertexList[v].label);
    }

    public void dfs() {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theStack.push(0);
        while( !theStack.isEmpty() ) {
            int v = getAdjUnvisitedVertex(theStack.peek());
            if(v == -1)
                theStack.pop();
            else {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                theStack.push(v);
            }
        }
        resetVisited();
    }

    public void bfs() {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theQueue.add(0);
        int v2;
        while( !theQueue.isEmpty() ) {
            int v1 = theQueue.remove();
            while((v2 = getAdjUnvisitedVertex(v1)) != -1) {
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                theQueue.add(v2);
            }
        }
        resetVisited();
    }

    private void resetVisited() {
        for(int i = 0; i < vCount; i++)
            vertexList[i].wasVisited = false;
    }

    private int getAdjUnvisitedVertex(int v) {
        for(int j = 0; j < vCount; j++)
            if(adjMat[v][j] == 1 && vertexList[j].wasVisited == false)
                return j;
        return -1;
    }

    public static class Vertex {
        public char label;
        public boolean wasVisited;

        public Vertex(char lab) {
            label = lab;
            wasVisited = false;
        }
    }
}

