package net.jason_emerson;

public class BinarySearchTree {
    private NodeBinarySearchTree root;

    public BinarySearchTree() {
        root = null;
    }

    public NodeBinarySearchTree find(int key) {
        NodeBinarySearchTree current = root;
        while(current.iData != key) {
            if(key < current.iData)
                current = current.leftChild;
            else
                current = current.rightChild;
            if(current == null)
                return null;
        }
        return current;
    }

    public void insert(int id, double dd) {
        NodeBinarySearchTree newNode = new NodeBinarySearchTree();
        newNode.iData = id;
        newNode.data = dd;
        if(root==null)
            root = newNode;
        else {
            NodeBinarySearchTree current = root;
            NodeBinarySearchTree parent;
            while(true) {
                parent = current;
                if(id < current.iData) {
                    current = current.leftChild;
                    if(current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if(current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean delete(int key) {
        NodeBinarySearchTree current = root;
        NodeBinarySearchTree parent = root;
        boolean isLeftChild = true;
        while (current.iData != key) {
            parent = current;
            if (key < current.iData) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null)
                return false;
        }

        if (current.leftChild == null && current.rightChild == null) {
            if (current == root)
                root = null;
            else if (isLeftChild)
                parent.leftChild = null;
            else
                parent.rightChild = null;
        } else if (current.rightChild == null)
            if (current == root)
                root = current.leftChild;
            else if (isLeftChild)
                parent.leftChild = current.leftChild;
            else
                parent.rightChild = current.leftChild;

        else if (current.leftChild == null)
            if (current == root)
                root = current.rightChild;
            else if (isLeftChild)
                parent.leftChild = current.rightChild;
            else
                parent.rightChild = current.rightChild;
        else {
            NodeBinarySearchTree successor = getSuccessor(current);

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


    private NodeBinarySearchTree getSuccessor(NodeBinarySearchTree delNode) {
        NodeBinarySearchTree successorParent = delNode;
        NodeBinarySearchTree successor = delNode;
        NodeBinarySearchTree current = delNode.rightChild; 
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

    
    private void preOrder(NodeBinarySearchTree localRoot) {
        if(localRoot != null) {
            System.out.print(localRoot.iData + " ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    private void inOrder(NodeBinarySearchTree localRoot) {
        if(localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.iData + " ");
            inOrder(localRoot.rightChild);
        }
    }

    private void postOrder(NodeBinarySearchTree localRoot) {
        if(localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.iData + " ");


        }
    }

    private void printLevelOrder(NodeBinarySearchTree root) {
        java.util.Queue<NodeBinarySearchTree> queue = new java.util.LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            NodeBinarySearchTree temp = queue.poll();
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
        java.util.Stack globalStack = new java.util.Stack<NodeBinarySearchTree>();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println(
                "......................................................");
        while(!isRowEmpty) {
            java.util.Stack localStack = new java.util.Stack<NodeBinarySearchTree>();
            isRowEmpty = true;
            for(int j=0; j<nBlanks; j++)
                System.out.print(' ');
            while(!globalStack.isEmpty()) {
                NodeBinarySearchTree temp = (NodeBinarySearchTree)globalStack.pop();
                if(temp != null) {
                    System.out.print(temp.iData);
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
        



