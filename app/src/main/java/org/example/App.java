package org.example;

public class App {
    public static void main(String[] args) {
        Squirrel cheeks = new Squirrel("Cheeks");
        Node<Squirrel> nodeOne = new Node<>(cheeks);
        Squirrel squeaks = new Squirrel("Squeaks");
        Node<Squirrel> nodeTwo = new Node<>(squeaks);
        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");
        Node<Squirrel> nodeThree = new Node<>(fluffybutt);
        nodeOne.setLeft(nodeTwo);
        nodeOne.setRight(nodeThree);
        System.out.println("Root: " + nodeOne.getData().getName());
        System.out.println("Left Child: " + nodeOne.left().getData().getName());
        System.out.println("Right Child: " + nodeOne.right().getData().getName());
    }
}
