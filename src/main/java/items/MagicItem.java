package items;

import behaviours.IUse;
import players.Player;

public class MagicItem implements IUse {

    private int damage;
    private String spell;
    private String type;

    public MagicItem(int damage, String spell, String type) {
        this.damage = damage;
        this.spell = spell;
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public String getSpell() {
        return spell;
    }

    public String getType() {
        return type;
    }

    public void use(Player player){
        player.getHurt(damage);
    }
}
