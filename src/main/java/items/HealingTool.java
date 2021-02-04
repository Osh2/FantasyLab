package items;

import behaviours.IUse;
import players.Player;

public class HealingTool implements IUse {

    private String name;
    private int healing;

    public HealingTool(String name, int healing) {
        this.name = name;
        this.healing = healing;
    }

    public String getName() {
        return name;
    }

    public int getHealing() {
        return healing;
    }

    public void use(Player player){
        player.heal(healing);
    }
}
