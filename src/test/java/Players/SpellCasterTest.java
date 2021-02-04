package Players;

import items.Armour;
import items.Creature;
import items.MagicItem;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Fighter;
import players.SpellCaster;

import static org.junit.Assert.assertEquals;

public class SpellCasterTest {

    SpellCaster wizard;
    MagicItem wand;
    Creature spot;

    @Before
    public void before(){
        wand = new MagicItem(10, "Thunderbolt", "Wand");
        spot = new Creature("Spot", "3 Headed Dog", 10);
        wizard = new SpellCaster("Gandalf", 10, wand, spot);
    }

    @Test
    public void hasName(){
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(10, wizard.getHealthPoints());
    }

    @Test
    public void hasItem(){
        assertEquals(wand, wizard.getEquipped());
    }

    @Test
    public void inventoryShouldStartEmpty(){
        assertEquals(0, wizard.getInventory().size());
    }
}
