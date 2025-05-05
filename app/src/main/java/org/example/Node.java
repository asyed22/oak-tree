package org.example;

public class Node<T> {
    private T data;
    private Node<T> left;
    private Node<T> right;

    public Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void setLeft(Node<T> node) {
        this.left = node;
    }

    public void setRight(Node<T> node) {
        this.right = node;
    }

    public Node<T> left() {
        return this.left;
    }

    public Node<T> right() {
        return this.right;
    }

    public T getData() {
        return this.data;
    }
}
