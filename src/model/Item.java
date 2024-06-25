package model;

import categories.ItemType;
import categories.Priority;

/**
 * Represents an item needed for a project (apparel, gene scrolls, etc.)
 */
public class Item {
    private String name;
    private ItemType type;
    private int costT;
    private int costG;
    private Priority priority;
    private String link;
    private boolean isObtained;

    /**
     * Constructor for Item.
     */
    public Item() {
        name = "Untitled";
        type = ItemType.OTHER;
        costT = 0;
        costG = 0;
        priority = Priority.NONE;
        link = "None";
        isObtained = false;
    }

    /**
     * Changes an item's obtained status.
     */
    public void markObtained() {
        isObtained = !isObtained;
    }

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

    public int getCostT() {
        return costT;
    }

    public void setCostT(int costT) {
        this.costT = costT;
    }

    public int getCostG() {
        return costG;
    }

    public void setCostG(int costG) {
        this.costG = costG;
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
