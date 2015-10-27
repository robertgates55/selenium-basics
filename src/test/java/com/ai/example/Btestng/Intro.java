package com.ai.example.Btestng;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class Intro {

    @Test
    public void additionTest() {
        assertEquals(add(1, 2), 3, "additionTest method not working as expected");
    }

    private int add(int a, int b) {
        return a - b;
    }
}
