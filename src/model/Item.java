package model;

import categories.ItemType;
import categories.Priority;

/**
 * Represents an item needed for a project (apparel, gene scrolls, etc.)
 */
public class Item {
    private int costG;
    private int costT;
    private boolean isObtained;
    private String link;
    private String name;
    private Priority priority;
    private ItemType type;

    /**
     * Constructor for Item.
     *
     * By default, an Item's fields are a set of default values.
     * They can only be changed after instantiation.
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
    public void changeIsObtained() {
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
