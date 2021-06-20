package oop.assignment3.ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplacerTest {

    @Test
    void replaceInstances() {
        String s1 = "utilize utilizes hello use";
        String s2 = "use uses hello use";
        s1 = Replacer.replaceInstances(s1);
        assertEquals(s1, s2);
    }
    @Test
    void replaceInstances2() {
        String s1 = "utilize\nutilizes hello use";
        String s2 = "use\nuses hello use";
        s1 = Replacer.replaceInstances(s1);
        assertEquals(s1, s2);
    }
}