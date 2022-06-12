package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    @Test
    void Test() {
        int num = (int) Math.random() / 1;
        assertEquals(1, num+1);
    }
    @Test
    void Test2() {
        int num = (int) Math.random() / 1;
        assertEquals(0, num);
    }
}