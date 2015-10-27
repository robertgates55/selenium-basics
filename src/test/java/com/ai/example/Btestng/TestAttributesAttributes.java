package com.ai.example.Btestng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAttributesAttributes {

    @Parameters({"foo"}) // this will look up the parameter foo from the Btestng.xml file
    @Test(groups = "pointlessTests")
    public void parameterTest(String param) {
        assertEquals("bar", param);
    }
}
