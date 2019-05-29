package coord.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void lengthTest() {
        double RESULT = 15.811;
        assertEquals(RESULT, Distance.length(new Point(1, 4), new Point(6, 19)), 0.001);
    }
}