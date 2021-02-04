package itemsTest;

import items.Armour;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ArmourTest {

    Armour armour;

    @Before
    public void before(){
        armour = new Armour("Plate", 5);
    }

    @Test
    public void exists() {
        assertNotNull(armour);
    }

    @Test
    public void hasType() {
        assertEquals("Plate", armour.getType());
    }

    @Test
    public void hasRating() {
        assertEquals(5, armour.getRating());
    }
}
