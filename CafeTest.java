import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class CafeTest {
  
    @Test
    public void testListOfCups() {
        Cafe cafe = new Cafe();
        Cup cup = new Cup("Eve");

    cafe.register(cup);

        assertEquals(1, cafe.countcups());
    }
   
}
