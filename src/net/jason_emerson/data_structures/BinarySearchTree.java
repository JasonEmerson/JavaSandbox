package net.jason_emerson.data_structures;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public Node find(int key) {
        Node current = root;
        while(current.key != key) {
            if(key < current.key)
                current = current.leftChild;
            else
                current = current.rightChild;
            if(current == null)
                return null;
        }
        return current;
    }

    public void insert(int key, double dd) {
        Node newNode = new Node();
        newNode.key = key;
        newNode.data = dd;
        if (root == null) {
            root = newNode;
            return;
        }
        Node parent = null;
        Node current = root;
        while (current != null) {
            if(current.key > key) {
                parent = current;
                current = current.leftChild;
            } else {
                parent = current;
                current = current.rightChild;
            }
        }
        if (parent.key > key)
            parent.leftChild = newNode;
        else
            parent.rightChild = newNode;
    }

    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        while (current.key != key) { //find node to be deleted
            parent = current;
            if (key < current.key) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null)
                return false;
        }
        //current == node to be deleted
        if (current.leftChild == null && current.rightChild == null) { //node to delete has no children
            if (current == root)
                root = null;
            else if (isLeftChild)
                parent.leftChild = null;
            else
                parent.rightChild = null;
        } else if (current.rightChild == null)//<----------has left child
            if (current == root)
                root = current.leftChild;
            else if (isLeftChild)
                parent.leftChild = current.leftChild;
            else
                parent.rightChild = current.leftChild;

        else if (current.leftChild == null)//<-------------has right child
            if (current == root)
                root = current.rightChild;
            else if (isLeftChild)
                parent.leftChild = current.rightChild;
            else
                parent.rightChild = current.rightChild;
        else {//<------------------------------------------has two children
            Node successor = getSuccessor(current);

            if (current == root)
                root = successor;
            else if (isLeftChild)
                parent.leftChild = successor;
            else
                parent.rightChild = successor;

            successor.leftChild = current.leftChild;
        }
        return true;
    }


    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild;
        while(current != null) { 
            successorParent = successor;
            successor = current;
            current = current.leftChild; 
        }

        if(successor != delNode.rightChild) { 
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }

    public static class Node {
        public int key;
        public double data;
        public Node leftChild;
        public Node rightChild;

        public void displayNode() {
            System.out.print('{');
            System.out.print(key);
            System.out.print(", ");
            System.out.print(data);
            System.out.print("} ");
        }
    }
   
    public void traverse(int traverseType) {
        switch(traverseType) {
            case 1: System.out.print("\nPreorder traversal: ");
                preOrder(root);
                break;
            case 2: System.out.print("\nInorder traversal: ");
                inOrder(root);
                break;
            case 3: System.out.print("\nPostorder traversal: ");
                postOrder(root);
                break;
            case 4: System.out.print("\nLevel order traversal: ");
                printLevelOrder(root);
                break;
        }
        System.out.println();
    }

    
    private void preOrder(Node localRoot) {
        if(localRoot != null) {
            System.out.print(localRoot.key + " ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    private void inOrder(Node localRoot) {
        if(localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.key + " ");
            inOrder(localRoot.rightChild);
        }
    }

    private void postOrder(Node localRoot) {
        if(localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.key + " ");


        }
    }

    private void printLevelOrder(Node root) {
        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            temp.displayNode();

            if (temp.leftChild != null) {
                queue.add(temp.leftChild);
            }

            if (temp.rightChild != null) {
                queue.add(temp.rightChild);
            }
        }
    }

    public void displayTree() {
        java.util.Stack globalStack = new java.util.Stack<Node>();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println(
                "......................................................");
        while(!isRowEmpty) {
            java.util.Stack localStack = new java.util.Stack<Node>();
            isRowEmpty = true;
            for(int j=0; j<nBlanks; j++)
                System.out.print(' ');
            while(!globalStack.isEmpty()) {
                Node temp = (Node)globalStack.pop();
                if(temp != null) {
                    System.out.print(temp.key);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                    if(temp.leftChild != null ||
                            temp.rightChild != null)
                        isRowEmpty = false;
                }
                else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for(int j=0; j<nBlanks*2-2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            nBlanks /= 2;
            while(!localStack.isEmpty())
                globalStack.push( localStack.pop() );
        }
        System.out.println(
                "......................................................");
    }

}    
        



