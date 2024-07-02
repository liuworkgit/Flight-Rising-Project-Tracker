package managers;

import model.Item;

import java.util.ArrayList;

/**
 * A module that organizes and manages a project's items.
 */
public class ItemManager extends Manager<Item> {
    /**
     * Returns a list of the items filtered accordingly.
     */
    public ArrayList<Item> filterBy(String howTo) {}

    /**
     * Returns the item associated with the given key.
     */
    public Item find(String key) {}
}
