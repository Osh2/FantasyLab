package Players;

import items.Armour;
import items.HealingTool;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import players.Fighter;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Weapon axe;
    Armour armour;
    HealingTool potion;

    @Before
    public void before(){
        axe = new Weapon(10, "big chopper", "axe");
        cleric = new Cleric("Dave", 30, axe, "School of Medicine");
        potion = new HealingTool("Healing potion", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Dave", cleric.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(30, cleric.getHealthPoints());
    }

    @Test
    public void hasItem(){
        assertEquals(axe, cleric.getEquipped());
    }

    @Test
    public void inventoryShouldStartEmpty(){
        assertEquals(0, cleric.getInventory().size());
    }

    @Test
    public void canAddItem() {
        cleric.addToInventory(potion);
        assertEquals(1, cleric.getInventory().size());
    }

    @Test
    public void canFlipEquipped() {
        cleric.addToInventory(potion);
        cleric.equipFlip(0);
        assertEquals(potion, cleric.getEquipped());
    }
}
