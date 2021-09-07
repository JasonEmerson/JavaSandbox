package net.jason_emerson;

public class TestTrie {
    public static void main (String[] args) {
        // construct a new Trie node
        Trie head = new Trie();

        head.insert("program");
        head.insert("programmer");
        head.insert("programming");

        System.out.println(head.search("program"));       // true
        System.out.println(head.search("programmer"));   // true
        System.out.println(head.search("programming")); // true
        System.out.println(head.search("progress"));   // false

        head.insert("progress");

        System.out.println(head.search("program"));        // true
        System.out.println(head.search("programmer"));    // true
        System.out.println(head.search("programming"));  // true
        System.out.println(head.search("progress"));    // true
    }
}
