package model;

import categories.BreedType;
import categories.Priority;
import managers.ItemManager;

/**
 * Represents a Flight Rising project.
 */
public class Project {
    private BreedType breedType;
    private boolean isFinished;
    private ItemManager items;
    private String link;
    private String name;
    private Priority priority;
    private float progress;
    private BudgetTracker budget;
}
