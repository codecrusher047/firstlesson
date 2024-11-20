import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class CupTest {
  
    @Test
    public void testEmptyCup() {
        Cup cup = new Cup("Eve");

        cup.fill(50);
        cup.empty();

        assertEquals(0, cup.content);
    }
    @Test
    public void testfillCup() {
        Cup cup = new Cup("Eve");
        cup.size = 200;

        cup.fill(50);
        cup.fill (100);
    

        assertEquals(150, cup.content);
    }
    @Test
    public void testfillCupToomuch() {
        Cup cup = new Cup("Eve");
        cup.size = 200;

        cup.fill(50);
        cup.fill (300);
    

        assertEquals(200, cup.content);
    }
}
