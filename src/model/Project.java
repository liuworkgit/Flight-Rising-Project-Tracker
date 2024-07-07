package model;

import categories.BreedType;
import categories.CurrencyType;
import managers.ItemManager;

import java.util.ArrayList;
// TODO - FIELDS AND METHODS
/**
 * Represents a Flight Rising project.
 */
public class Project {
    private BreedType breedType;
    private BudgetTracker budget;
    private boolean isFinished;
    private ItemManager items;
    private String link;
    private String name;
    private float percentDone;

    /**
     * Constructor for Project.
     *
     * By default, a Project's fields are a set of default values.
     * They can only be changed after instantiation.
     */
    public Project() {}

    /**
     * Calculates the completion percentage based on the number
     * of items obtained.
     * @return float
     */
    public float calcPercentDone() {
        return 0; // stub
    }

    /**
     * Returns the total cost of the project in the given currency type.
     * @return Integer
     */
    public Integer getTotalCost(CurrencyType type) {
        return 0; // stub
    }

    /**
     * Returns the total amount spent on the project in the given currency type.
     * @return Integer
     */
    public Integer getTotalSpent(CurrencyType type) {
        return 0; // stub
    }

    /**
     * Adds a new item to the project.
     */
    public void addItem(Item item) {}

    /**
     * Deletes an item from the project.
     */
    public void deleteItem(Item item) {}

    /**
     * Marks an item as obtained.
     */
    public void markAsObtained(Item item) {}

    /**
     * Returns an array with the items sorted accordingly.
     * @return ArrayList
     */
    public ArrayList<Item> filterItems(String howTo) {
        return new ArrayList<>(); // stub
    }

    /**
     * Returns the item with the given name.
     * @return Item
     */
    public Item findItem(String name) {
        return new Item(); // stub
    }

    // Getters and Setters
    public BreedType getBreedType() {
        return breedType;
    }
    public void setBreedType(BreedType breedType) {
        this.breedType = breedType;
    }

    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getPercentDone() {
        return percentDone;
    }

    public boolean getIsFinished() {
        return isFinished;
    }
    public void markAsFinished() {
        isFinished = !isFinished;
    }
}
