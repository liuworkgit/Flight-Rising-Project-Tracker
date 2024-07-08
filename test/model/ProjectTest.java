package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTest {
    private Project proj;

    /**
     * Set-up method before each test.
     */
    @BeforeEach
    void runBefore() {
        proj = new Project();
    }

    /**
     * Test for the default values of Project.
     */
    @Test
    void testConstructor() {}

    /**
     * Tests if able to set the values of a Project.
     */
    @Test
    void testSetValues() {}

    /**
     * Tests if able to accurately calculate the completion
     * percentage of a Project with no items at all.
     */
    @Test
    void testCalcDoneNoItems() {}

    /**
     * Tests if able to accurately calculate the completion
     * percentage of a Project with only unobtained items.
     */
    @Test
    void testCalcDoneAllUnobtained() {}

    /**
     * Tests if able to accurately calculate the completion
     * percentage of a Project with some obtained items and
     * some unobtained items.
     */
    @Test
    void testCalcDoneSomeObtained() {}

    /**
     * Tests if able to accurately calculate the completion
     * percentage of a Project with all items obtained.
     */
    @Test
    void testCalcDoneAllObtained() {}

    /**
     * Tests if able to get the total cost and amount spent of a
     * project with no items.
     */
    @Test
    void testGetTotalsNoItems() {}

    /**
     * Tests if able to get the total cost and amount spent of a
     * project with some items that don't have costs/haven't been
     * paid for.
     */
    @Test
    void testGetTotalsItemsArentPriced() {}

    /**
     * Tests if able to get the total cost and amount spent of a
     * project with some items that do have costs/have been paid
     * for.
     */
    @Test
    void testGetTotalsItemsArePriced() {}

    /**
     * Tests if able to add a new Item to the Project.
     */
    @Test
    void testAddItem() {}

    /**
     * Tests if able to delete an Item from the Project.
     */
    @Test
    void testDeleteItem() {}

    /**
     * Tests if able to manually mark a Project as finished.
     */
    @Test
    void testMarkFinishedManual() {}

    /**
     * Tests if able to mark an Item in the Project as obtained,
     * which doesn't auto-mark the Project as finished.
     */
    @Test
    void testMarkItemObtained() {}

    /**
     * Tests if able to mark an Item in the Project as obtained,
     * subsequently auto-marking the Project as finished.
     */
    @Test
    void testAutoFinish() {}

    /**
     * Tests if able to filter the Project's Items by name.
     */
    @Test
    void testFilterByName() {}

    /**
     * Tests if able to filter the Project's Items by priority.
     */
    @Test
    void testFilterByPriority() {}

    /**
     * Tests if able to find an Item that is there.
     */
    @Test
    void testFindSuccessful() {}

    /**
     * Tests if able to find an Item that isn't there.
     */
    @Test
    void testFindFail() {}
}