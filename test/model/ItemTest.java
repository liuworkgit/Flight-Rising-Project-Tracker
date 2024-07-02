package model;

import categories.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Item.
 */
class ItemTest {
    Item item;

    /**
     * Set-up method before each test.
     */
    @BeforeEach
    void runBefore() {
        item = new Item();
    }

    /**
     * Test for the default values of Item.
     */
    @Test
    void testConstructor() {
        compareValues(
                item,
                "Untitled",
                ItemType.OTHER,
                0,
                0,
                Priority.NONE,
                "None",
                false
        );
    }

    /**
     * Tests if able to set new values for an item's fields.
     */
    @Test
    void testSetValues() {
        item.setName("Cloudy Tail Feathers");
        item.setType(ItemType.APPAREL);
        item.setCostT(10000);
        item.setCostG(10);
        item.setPriority(Priority.HIGH);
        item.setLink("www.flightrising.com");
        item.changeIsObtained();

        compareValues(
                item,
                "Cloudy Tail Feathers",
                ItemType.APPAREL,
                10000,
                10,
                Priority.HIGH,
                "www.flightrising.com",
                true
        );
    }

    /**
     * Tests if able to change an item's obtained status.
     */
    @Test
    void testMarkObtained() {
        item.changeIsObtained();
        assertTrue(item.getObtained());
    }

    /**
     * Helper function for testConstructor and testSetValues.
     */
    private void compareValues(Item i, String n, ItemType it, int ct, int cg, Priority p, String l, boolean o) {
        assertEquals(i.getName(), n);
        assertSame(i.getType(), it);
        assertEquals(i.getCostT(), ct);
        assertEquals(i.getCostG(), cg);
        assertSame(i.getPriority(), p);
        assertEquals(i.getLink(), l);
        assertEquals(i.getObtained(), o);
    }
}