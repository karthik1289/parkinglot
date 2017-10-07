package com.gojek.parkinglot.core.utils;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test class for {@link StringUtils}
 * @author Karthik
 */
public class StringUtilsTest {

    /**
     * Test method for {@link StringUtils#isValidFile(String)}
     */
    @Test
    public void testIsValidFile(){
        Assert.assertTrue(StringUtils.isValidFile("file_inputs.txt"));
        Assert.assertFalse(StringUtils.isValidFile(""));
        Assert.assertFalse(StringUtils.isValidFile("file_inputs.json"));
    }
}
