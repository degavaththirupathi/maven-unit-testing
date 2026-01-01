package com.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void add_shouldReturnSum() {
        App c = new App();
        assertEquals(5, c.add(2, 3));
    }
}
