package net.jason_emerson;

public class NodeBinarySearchTree {
    public int iData;
    public double data;
    public NodeBinarySearchTree leftChild;
    public NodeBinarySearchTree rightChild;

    public void displayNode() {
        System.out.print('{');
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(data);
        System.out.print("} ");
    }
}

