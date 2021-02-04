package items;

import behaviours.IUse;
import players.Player;

public class Weapon implements IUse {

    private int damage;
    private String name;
    private String type;

    public Weapon(int damage, String name, String type) {
        this.damage = damage;
        this.name = name;
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void use(Player player){
        player.getHurt(damage);
    }
}
