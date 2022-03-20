package com.company;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MainTest {
    @Test
    public void test_getSum_with_A(){
        int sum = new Main().getSum("A");
        assertEquals(sum,1);
    }
    @Test
    public void test_getSum_with_Z(){
        int sum = new Main().getSum("Z");
        assertEquals(sum,26);
    }
    @Test
    public void test_getSum_with_Az(){
        int sum = new Main().getSum("Az");
        assertEquals(sum,27);
    }
    @Test
    public void test_getSum_with_Test(){
        int sum = new Main().getSum("Test");
        assertEquals(sum,64);
    }
    @Test
    public void test_getSum_with_Te_st(){
        int sum = new Main().getSum("Te st");
        assertEquals(sum,64);
    }
    @Test
    public void test_getSum_with_Ivan(){
        int sum = new Main().getSum("Ivan");
        assertEquals(sum,46);
    }
}
