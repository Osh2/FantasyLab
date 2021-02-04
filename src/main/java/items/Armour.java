package items;

public class Armour {

    private String type;
    private int rating;

    public Armour(String type, int rating) {
        this.type = type;
        this.rating = rating;
    }

    public String getType() {
        return type;
    }

    public int getRating() {
        return rating;
    }
}
