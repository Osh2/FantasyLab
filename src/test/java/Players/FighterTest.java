package Players;

import items.Armour;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Fighter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FighterTest {

    Fighter dwarf;
    Weapon axe;
    Armour armour;

    @Before
    public void before(){
        axe = new Weapon(10, "big chopper", "axe");
        armour = new Armour("Chainmail", 4);
        dwarf = new Fighter("Joe", 20, axe, armour);
    }

    @Test
    public void hasName(){
        assertEquals("Joe", dwarf.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(20, dwarf.getHealthPoints());
    }

    @Test
    public void hasItem(){
        assertEquals(axe, dwarf.getEquipped());
    }

    @Test
    public void inventoryShouldStartEmpty(){
        assertEquals(0, dwarf.getInventory().size());
    }

    @Test
    public void hasArmour(){
        assertEquals(armour, dwarf.getArmour());
    }


}
