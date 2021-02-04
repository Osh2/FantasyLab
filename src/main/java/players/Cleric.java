package players;

import behaviours.IUse;

public class Cleric extends Player {

    private String order;

    public Cleric(String name, int healthPoints, IUse equipped, String order) {
        super(name, healthPoints, equipped);
        this.order = order;
    }

    public String getOrder() {
        return order;
    }
}
