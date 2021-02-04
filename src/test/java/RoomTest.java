import behaviours.IUse;
import items.Creature;
import items.MagicItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RoomTest {

    Room dungeon;
    MagicItem treasure;
    Creature monster;

    @Before
    public void beforeEachTest(){
        treasure = new MagicItem(5, "Inflict Wounds", "Scroll");
        monster = new Creature("Angry Pete", "Human", 8);
        dungeon = new Room(treasure, monster);
    }

    @Test
    public void exists() {
        assertNotNull(dungeon);
    }

    @Test
    public void hasTresure() {
        assertEquals(treasure, dungeon.getTreasure());
    }

    @Test
    public void hasMonster() {
        assertEquals(monster, dungeon.getMonster());
    }

    @Test
    public void hasNoAdventurers() {
        assertEquals(0, dungeon.getAdventurers().size());
    }
}
