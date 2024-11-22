import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class CafeHouseTest {
  
    @Test
    public void testListOfCups() {
        CafeHouse cafe = new CafeHouse();
        Cup cup = new Cup("Eve");

    cafe.register(cup);

        assertEquals(1, cafe.countcups());
    }
   
}
