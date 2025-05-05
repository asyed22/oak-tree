package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testTreeStructure() {
        Squirrel testSquirrel = new Squirrel("Testy");
        Node<Squirrel> root = new Node<>(testSquirrel);
        assertEquals("Testy", root.getData().getName());
    }

    @Test
    void testLeftAndRightChildren() {
        Squirrel rootSquirrel = new Squirrel("Root");
        Squirrel leftSquirrel = new Squirrel("Lefty");
        Squirrel rightSquirrel = new Squirrel("Righty");

        Node<Squirrel> root = new Node<>(rootSquirrel);
        Node<Squirrel> left = new Node<>(leftSquirrel);
        Node<Squirrel> right = new Node<>(rightSquirrel);

        root.setLeft(left);
        root.setRight(right);

        assertEquals("Lefty", root.left().getData().getName());
        assertEquals("Righty", root.right().getData().getName());
    }
}
