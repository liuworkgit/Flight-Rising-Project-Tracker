package model.managers;

import java.util.ArrayList;
import java.util.HashMap;

// TODO figure out how relate manager to its kids
/**
 * Represents a module which can organize and sort various things.
 * */
public abstract class Manager {
    private ArrayList<Object> listToManage;
    private HashMap<Object, Object> groupByTraits;

    public void add() {}
    public void delete() {}
    public void rename() {}
    public void edit() {}
    public void filterBy() {}
    public void markDone() {}
}
