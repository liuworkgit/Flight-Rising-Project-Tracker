package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    @Test
    // Tests default constructor
    void testDefaultConstructor() {
        Item defaultItem = new Item();
        assertEquals("New Item", defaultItem.getName());
        assertEquals(ItemType.OTHER, defaultItem.getType());
        assertEquals(0, defaultItem.getCost());
        assertFalse(defaultItem.getStatus());
        assertEquals("N/A", defaultItem.getLink());
    }

    @Test
    // Tests parameterized constructor
    void testParameterConstructor() {
        Item paraItem = new Item(
                "Adjudicator Collar",
                ItemType.APPAREL,
                50000,
                true,
                "https://www1.flightrising.com/game-database/item/35517");
        isChanged(paraItem);
    }

    @Test
    // Tests if able to change item object fields
    void testGetters() {
        Item item = new Item();
        item.setName("Adjudicator Collar");
        item.setType(ItemType.APPAREL);
        item.setCost(50000);
        item.setStatus(true);
        item.setLink("https://www1.flightrising.com/game-database/item/35517");
        isChanged(item);
    }

    // Helper function for testGetters and testParameterConstructor
    private void isChanged(Item testItem) {
        assertEquals("Adjudicator Collar", testItem.getName());
        assertEquals(ItemType.APPAREL, testItem.getType());
        assertEquals(50000, testItem.getCost());
        assertTrue(testItem.getStatus());
        assertEquals(
                "https://www1.flightrising.com/game-database/item/35517",
                testItem.getLink());
    }
}