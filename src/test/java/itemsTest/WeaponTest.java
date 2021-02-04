package itemsTest;

import items.HealingTool;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import players.Fighter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WeaponTest {

    Weapon weapon;
    Cleric cleric;
    HealingTool potion;

    @Before
    public void before(){
        weapon = new Weapon(5, "Stabby", "Dagger");
        potion = new HealingTool("Health Potion", 5);
        cleric = new Cleric("Gill", 30, potion, "Order of Gid Guys");
    }

    @Test
    public void itemExists(){
        assertNotNull(weapon);
    }

    @Test
    public void hasName() {
        assertEquals("Stabby", weapon.getName());
    }

    @Test
    public void hasType() {
        assertEquals("Dagger", weapon.getType());
    }

    @Test
    public void hasDamage() {
        assertEquals(5, weapon.getDamage());
    }

    @Test
    public void canUse() {
        weapon.use(cleric);
        assertEquals(25, cleric.getHealthPoints());
    }
}
