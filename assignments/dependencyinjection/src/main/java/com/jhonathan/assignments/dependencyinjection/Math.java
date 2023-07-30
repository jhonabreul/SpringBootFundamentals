package com.jhonathan.assignments.dependencyinjection;

import org.springframework.stereotype.Service;

@Service
public class Math {
    
    public int sum(int a, int b) {
        return a + b;
    }
}
