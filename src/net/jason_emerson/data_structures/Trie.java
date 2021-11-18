package net.jason_emerson.data_structures;

public class Trie {
    private final int ALPHABET_SIZE = 26;
    public Node root = new Node();

    public void insert(String key) {
//        System.out.print("Inserting: ");

        Node current = root;
        int level;
        int length = key.length();
        int index;

        for (level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';
//            System.out.print(key.charAt(level) + " ");
            if (current.children[index] == null)
                current.children[index] = new Node();
            current = current.children[index];
        }
        current.isEndOfWord = true;
//        System.out.println();
    }

    public boolean search(String key) {
//        System.out.println();
//        System.out.print("Searching: ");

        Node current = root;
        int level;
        int length = key.length();
        int index;

        for (level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';
//            System.out.print(key.charAt(level) + " ");
            if (current.children[index] == null)
                return false;
            current = current.children[index];
        }
        return (current.isEndOfWord);
    }

    public class Node {
        Node[] children = new Node[ALPHABET_SIZE];
        boolean isEndOfWord;

        Node() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
    }
}
