package com.demo;

import org.junit.Assert;
import org.junit.Test;

public class TestDemo {

    @Test
    public void testSame() {
        String ret = Demo.JustTheSame("2");
        Assert.assertEquals("2", ret);
    }
}
