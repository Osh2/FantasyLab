package itemsTest;

import items.HealingTool;
import items.MagicItem;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MagicItemTest {

    MagicItem wand;
    Cleric cleric;
    HealingTool potion;

    @Before
    public void before(){
        wand = new MagicItem(10, "Fire Ball", "Wand");
        potion = new HealingTool("Health Potion", 5);
        cleric = new Cleric("Gill", 30, potion, "Order of Gid Guys");
    }

    @Test
    public void itemExists(){
        assertNotNull(wand);
    }

    @Test
    public void hasSpellName() {
        assertEquals("Fire Ball", wand.getSpell());
    }

    @Test
    public void hasType() {
        assertEquals("Wand", wand.getType());
    }

    @Test
    public void hasDamage() {
        assertEquals(10, wand.getDamage());
    }

    @Test
    public void canUse() {
        wand.use(cleric);
        assertEquals(20, cleric.getHealthPoints());
    }
}
