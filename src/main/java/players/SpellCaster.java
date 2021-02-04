package players;

import behaviours.IUse;
import items.Creature;

public class SpellCaster extends Player {

    private Creature creature;

    public SpellCaster(String name, int healthPoints, IUse equipped, Creature creature) {
        super(name, healthPoints, equipped);
        this.creature = creature;
    }

    public Creature getCreature() {
        return creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }
}
