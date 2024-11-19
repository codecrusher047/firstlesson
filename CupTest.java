import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class CupTest {
  
    @Test
    public void testEmptyCup() {
        Cup cup = new Cup();

        cup.fill(50);
        cup.empty();

        assertEquals(0, cup.content);
    }
}
