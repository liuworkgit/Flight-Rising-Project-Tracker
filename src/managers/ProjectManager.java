package managers;

import model.Project;

import java.util.ArrayList;

/**
 * A module that organizes and manages projects.
 * */
public class ProjectManager extends Manager<Project> {
    /**
     * Returns a list of the projects filtered accordingly.
     */
    public ArrayList<Project> filterBy(String howTo) {}

    /**
     * Returns the project associated with the given key.
     */
    public Project find(String key) {}
}
