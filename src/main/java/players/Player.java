package players;

import behaviours.IUse;

import java.util.ArrayList;

public abstract class Player {

    private int healthPoints;
    private ArrayList<IUse> inventory;
    private IUse equipped;
    private String name;

    public Player(String name, int healthPoints, IUse equipped) {
        this.healthPoints = healthPoints;
        this.inventory = new ArrayList<>();
        this.equipped = equipped;
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public ArrayList<IUse> getInventory() {
        return inventory;
    }

    public IUse getEquipped() {
        return equipped;
    }

    public void getHurt(int damage){
        healthPoints -= damage;
    }

    public void heal(int healing){
        healthPoints += healing;
    }

    public String getName() {
        return name;
    }

    public void addToInventory(IUse item){
        inventory.add(item);
    }

    public void equipFlip(int index){
        equipped = inventory.remove(index);
    }
}
