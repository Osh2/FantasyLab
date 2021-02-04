package itemsTest;

import items.HealingTool;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HealingToolTest {

    Cleric cleric;
    HealingTool potion;

    @Before
    public void before(){
        potion = new HealingTool("Health Potion", 5);
        cleric = new Cleric("Gill", 30, potion, "Order of Gid Guys");
    }

    @Test
    public void itemExists(){
        assertNotNull(potion);
    }

    @Test
    public void hasName() {
        assertEquals("Health Potion", potion.getName());
    }

    @Test
    public void hasHealingProperties() {
        assertEquals(5, potion.getHealing());
    }

    @Test
    public void canUse() {
        potion.use(cleric);
        assertEquals(35, cleric.getHealthPoints());
    }
}
