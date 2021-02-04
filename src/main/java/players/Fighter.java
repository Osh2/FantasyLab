package players;

import behaviours.IUse;
import items.Armour;

public class Fighter extends Player{

    private Armour armour;

    public Fighter(String name, int healthPoints, IUse equipped, Armour armour) {
        super(name, healthPoints, equipped);
        this.armour = armour;
    }

    public Armour getArmour() {
        return armour;
    }

}
