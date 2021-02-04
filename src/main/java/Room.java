import behaviours.IUse;
import items.Creature;
import players.Player;

import java.util.ArrayList;

public class Room {

    private IUse treasure;
    private Creature monster;
    private ArrayList<Player> adventurers;


    public Room(IUse treasure, Creature monster) {
        this.treasure = treasure;
        this.monster = monster;
        this.adventurers = new ArrayList<>();
    }

    public IUse getTreasure() {
        return treasure;
    }

    public void setTreasure(IUse treasure) {
        this.treasure = treasure;
    }

    public Creature getMonster() {
        return monster;
    }

    public void setMonster(Creature monster) {
        this.monster = monster;
    }

    public ArrayList<Player> getAdventurers() {
        return adventurers;
    }

    public void setAdventurers(ArrayList<Player> adventurers) {
        this.adventurers = adventurers;
    }
}
