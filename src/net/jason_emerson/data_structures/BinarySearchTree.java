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
                current = current.left;
            else
                current = current.right;
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
                current = current.left;
            } else {
                parent = current;
                current = current.right;
            }
        }
        if (parent.key > key)
            parent.left = newNode;
        else
            parent.right = newNode;
    }

    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        while (current.key != key) { //find node to be deleted
            parent = current;
            if (key < current.key) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null)
                return false;
        }
        //current == node to be deleted
        if (current.left == null && current.right == null) { //node to delete has no children
            if (current == root)
                root = null;
            else if (isLeftChild)
                parent.left = null;
            else
                parent.right = null;
        } else if (current.right == null)//<----------has left child
            if (current == root)
                root = current.left;
            else if (isLeftChild)
                parent.left = current.left;
            else
                parent.right = current.left;

        else if (current.left == null)//<-------------has right child
            if (current == root)
                root = current.right;
            else if (isLeftChild)
                parent.left = current.right;
            else
                parent.right = current.right;
        else {//<------------------------------------------has two children
            Node successor = getSuccessor(current);

            if (current == root)
                root = successor;
            else if (isLeftChild)
                parent.left = successor;
            else
                parent.right = successor;

            successor.left = current.left;
        }
        return true;
    }


    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.right;
        while(current != null) { 
            successorParent = successor;
            successor = current;
            current = current.left;
        }

        if(successor != delNode.right) {
            successorParent.left = successor.right;
            successor.right = delNode.right;
        }
        return successor;
    }

    public static class Node {
        public int key;
        public double data;
        public Node left;
        public Node right;

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
            preOrder(localRoot.left);
            preOrder(localRoot.right);
        }
    }

    private void inOrder(Node localRoot) {
        if(localRoot != null) {
            inOrder(localRoot.left);
            System.out.print(localRoot.key + " ");
            inOrder(localRoot.right);
        }
    }

    private void postOrder(Node localRoot) {
        if(localRoot != null) {
            postOrder(localRoot.left);
            postOrder(localRoot.right);
            System.out.print(localRoot.key + " ");


        }
    }

    private void printLevelOrder(Node root) {
        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            temp.displayNode();

            if (temp.left != null) {
                queue.add(temp.left);
            }

            if (temp.right != null) {
                queue.add(temp.right);
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
                    localStack.push(temp.left);
                    localStack.push(temp.right);
                    if(temp.left != null ||
                            temp.right != null)
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
        



