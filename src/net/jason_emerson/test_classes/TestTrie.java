package net.jason_emerson.test_classes;

import net.jason_emerson.dailies.TrieDaily;

public class TestTrie {
    public static void main(String[] args) {
        TrieDaily trie = new TrieDaily();


        trie.insert("test");
        System.out.println(trie.search("test"));

        System.out.println(trie.search("testing"));

        trie.insert("testing");
        System.out.println(trie.search("testing"));

    }
}
