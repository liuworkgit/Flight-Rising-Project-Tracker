package managers;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Represents a module which can organize, sort and manage various responsibilities.
 * */
public abstract class Manager<T> {
    private HashMap<String, T> resps;
    private int numResps;

    /**
     * Adds a responsibility to the manager.
     */
    public void add(T t) {}

    /**
     * Deletes a responsibility from the manager.
     */
    public void delete(String key) {}

    /**
     * Returns a list of the responsibilities filtered accordingly.
     */
    public abstract ArrayList<T> filterBy(String howTo);

    /**
     * Returns the responsibility associated with the given key.
     */
    public abstract T find(String key);
}
