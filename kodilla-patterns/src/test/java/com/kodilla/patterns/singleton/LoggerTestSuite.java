package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {

        Logger.getInstance().log("ab");
        Logger.getInstance().log("cd");
        Logger.getInstance().log("ef");
        System.out.println(Logger.getInstance().getLastLog());
        Assert.assertEquals("ef", Logger.getInstance().getLastLog());
    }
}
