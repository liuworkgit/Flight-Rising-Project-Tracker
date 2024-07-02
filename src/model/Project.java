package model;

import categories.BreedType;
import categories.Priority;
import managers.ItemManager;

/**
 * Represents a Flight Rising project.
 */
public class Project {
    private String name;
    private float progress;
    private BreedType breedType;
    private String link;
    private ItemManager items;
    private Priority priority;

    /**
     * see the completion status of a project based on the number of pieces obtained.
     * see the total amount of treasure and gems spent on a single project.
     * see the total amount of treasure and gems needed based on user-inputted costs for individual pieces.
     * add a new piece with the option to input a name, type, cost, priority, and link to its database entry on-site.
     * delete a piece.
     * edit a piece's details.
     * mark a piece as "obtained."
     * filter a project's pieces by name, cost and priority.
     * see all the pieces needed for a single project.
     */
}
