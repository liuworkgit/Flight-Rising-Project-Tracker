package managers;

import model.Project;

import java.util.ArrayList;
// TODO - FIELDS AND METHODS

/**
 * A module that organizes and manages projects.
 * */
public class ProjectManager extends Manager<Project> {
    /**
     * Returns a list of the projects filtered accordingly.
     */
    public ArrayList<Project> filterBy(String howTo) {
        return new ArrayList<>(); // stub
    }

    /**
     * Returns the project associated with the given key.
     */
    public Project find(String key) {
        return new Project(); // stub
    }
}
