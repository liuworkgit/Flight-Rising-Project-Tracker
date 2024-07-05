package model;

import categories.CurrencyType;

import java.util.HashMap;

/**
 * Tracks a project's total cost and amount of money spent on it.
 *
 * A project's budget will have four amounts:
 * - The total needed cost (in treasure and gems)
 * - The total amount spent (in treasure and gems)
 */
public class BudgetTracker {
    private HashMap<CurrencyType, Integer> budget;

    /**
     * Constructor for BudgetTracker.
     *
     * By default, values are 0. These can only be set after initialization.
     */
    public BudgetTracker() {}

    /**
     * Gets the total needed cost in the specified currency type.
     * @return Integer
     */
    public Integer getCost(CurrencyType type) {
        return 0; // stub
    }

    /**
     * Sets the total needed cost of the specified currency type.
     * @param type - The currency type (treasure or gems)
     */
    public void setCost(CurrencyType type) {}

    /**
     * Gets the total amount spent in the specified currency type.
     * @return Integer
     */
    public Integer getSpent(CurrencyType type) {
        return 0; // stub
    }

    /**
     * Sets the total amount spent of the specified currency type.
     * @param type - The currency type (treasure or gems)
     */
    public void setSpent(CurrencyType type) {}
}
