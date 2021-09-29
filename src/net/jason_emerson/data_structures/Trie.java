package net.jason_emerson.data_structures;

public class Trie {
    private final int ALPHABET_SIZE = 26;
    public TrieNode root = new TrieNode();

    public void insert(String key) {
//        System.out.print("Inserting: ");

        TrieNode current = root;
        int level;
        int length = key.length();
        int index;

        for (level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';
//            System.out.print(key.charAt(level) + " ");
            if (current.children[index] == null)
                current.children[index] = new TrieNode();
            current = current.children[index];
        }
        current.isEndOfWord = true;
//        System.out.println();
    }

    public boolean search(String key) {
//        System.out.println();
//        System.out.print("Searching: ");

        TrieNode current = root;
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

    public class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
    }
}
