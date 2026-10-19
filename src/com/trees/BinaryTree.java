package com.trees;

public class BinaryTree {
    public BinaryTree(){}

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int vlaue){
            this.value=vlaue;
        }
    }

    private Node root;


}
