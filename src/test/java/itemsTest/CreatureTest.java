package itemsTest;

import items.Creature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CreatureTest {

    Creature creature;

    @Before
    public void beforeEachTest(){
        creature = new Creature("Jeff", "Ogre", 5);
    }

    @Test
    public void exists() {
        assertNotNull(creature);
    }

    @Test
    public void hasName() {
        assertEquals("Jeff", creature.getName());
    }

    @Test
    public void hasDefense() {
        assertEquals(5, creature.getDefence());
    }

    @Test
    public void hasSpecies() {
        assertEquals("Ogre", creature.getSpecies());
    }
}
