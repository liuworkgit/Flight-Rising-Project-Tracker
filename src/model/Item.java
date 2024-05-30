package model;

/**
 * Represents an item needed for a project (apparel, gene scrolls, etc.)
 */
public class Item {
    private String name;
    private ItemType type; // default = ItemType.OTHER
    private int cost;
    private boolean status; // default = false (i.e. not yet obtained)
    private String link;

    /**
     * default constructor for Item.
     */
    public Item() {
        name = "New Item";
        type = ItemType.OTHER;
        cost = 0;
        status = false;
        link = "N/A";
    }

    /**
     * parameterized constructor for Item.
     */
    public Item(String name, ItemType type, int cost, boolean status, String link) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.status = status;
        this.link = link;
    }

    // getters and setters
    public String getName() {
      return name;
    }
    public void setName(String newName) {
        name = newName;
    }

    public ItemType getType() {
        return type;
    }
    public void setType(ItemType newType) {
        type = newType;
    }

    public int getCost() {
        return cost;
    }
    public void setCost(int newCost) {
        cost = newCost;
    }

    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean newStatus) {
        status = newStatus;
    }

    public String getLink() {
        return link;
    }
    public void setLink(String newLink) {
        link = newLink;
    }
}
