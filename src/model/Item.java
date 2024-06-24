package model;

import categories.ItemType;
import categories.Priority;

/**
 * Represents an item needed for a project (apparel, gene scrolls, etc.)
 */
public class Item {
    private String name;
    private ItemType type; // default = ItemType.OTHER
    private int cost;
    private Priority priority; // default = Priority.NONE
    private String link;
    private boolean isObtained; // default = false

    /**
     * Constructor for Item.
     */
    public Item(String n, ItemType it, int c, Priority p, String l) {}

    /**
     * Changes an item's obtained status.
     */
    public void markObtained() {}

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean getObtained() {
        return isObtained;
    }
}
