package com.gojek.parkinglot.core;

import com.gojek.parkinglot.core.parser.FileExecutor;
import com.gojek.parkinglot.core.parser.ShellExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test class for {@link InputFactory}
 * @author Karthik
 */
public class InputFactoryTest {

    private String[] validArgs = new String[] {"file_inputs.txt"};
    private String[] inValidArgs = new String[] {"file_inputs.txt","file_inputs.txt"};

    /**
     * Test method for {@link InputFactory#getExecutor(String[])}
     */
    @Test
    public void getExecutorTest(){
        Assert.assertTrue(InputFactory.getExecutor(validArgs) instanceof FileExecutor);
        Assert.assertNull(InputFactory.getExecutor(inValidArgs));
        Assert.assertTrue(InputFactory.getExecutor(new String[]{}) instanceof ShellExecutor);
    }
}
