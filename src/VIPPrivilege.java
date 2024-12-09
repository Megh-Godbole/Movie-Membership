/*
 * Author: Megh Godbole
 * Date: December 08, 2024
 * Purpose: This is a VIPPrivilege interface with a constant property and abstract methods.
 */

public interface VIPPrivilege {
    
    // Constant property.
    final int PASSWORD = 4562;

    // Abstract methods.

    public abstract void accessVIPLounge();

    public abstract String purchaseAlcohol();
}
