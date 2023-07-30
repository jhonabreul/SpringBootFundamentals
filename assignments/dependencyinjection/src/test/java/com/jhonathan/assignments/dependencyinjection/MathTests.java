package com.jhonathan.assignments.dependencyinjection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MathTests {
    
    @Autowired
    public Math math;

    @Test
    public void sumTest() {
        int expected = 5;
        int actual = math.sum(2, 3);
        assertEquals(expected, actual);
    }
}
