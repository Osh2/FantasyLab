package items;

public class Creature {

    private String name;
    private String species;
    private int defence;

    public Creature(String name, String species, int defence) {
        this.name = name;
        this.species = species;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getDefence() {
        return defence;
    }
}
