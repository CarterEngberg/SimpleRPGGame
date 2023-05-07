import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PlayerInventoryTest {

    @Test
    void addingItems() {
        // Single Item Addition Test
        PlayerItem scarf = new PlayerItem();
        PlayerInventory inventory = new PlayerInventory();
        inventory.addItem(scarf);

        int inventorySize = inventory.getNumberOfItems();

        Assert.assertEquals(1, inventorySize);

        // Multiple Item Addition Test
        PlayerItem baton = new PlayerItem();
        PlayerItem gun = new PlayerItem();
        PlayerItem jacket = new PlayerItem();

        inventory.addItem(baton);
        inventory.addItem(gun);
        inventory.addItem(jacket);

        inventorySize = inventory.getNumberOfItems();

        Assert.assertEquals(4, inventorySize);

    }

    @Test
    void displayingItems() {
        PlayerInventory inventory = new PlayerInventory();

        PlayerItem scarf = new PlayerItem("Scarf", 3, " ");
        PlayerItem baton = new PlayerItem("Baton", 3, " ");
        PlayerItem gun = new PlayerItem("Gun", 3, " ");
        PlayerItem jacket = new PlayerItem("Jacket", 3, " ");

        inventory.addItem(scarf);
        inventory.addItem(baton);
        inventory.addItem(gun);
        inventory.addItem(jacket);

        inventory.printInventoryItems();
    }

    @Test
    void sortingItems() {

        // Before Swap {Scarf, Baton, Gun, Jacket}
        // Swap1       {Scarf, Jacket, Gun, Baton}
        // Swap2       {Gun, Jacket, Scarf, Baton}

        PlayerInventory inventory = new PlayerInventory();

        PlayerItem scarf = new PlayerItem("Scarf", 3, " ");
        PlayerItem baton = new PlayerItem("Baton", 3, " ");
        PlayerItem gun = new PlayerItem("Gun", 3, " ");
        PlayerItem jacket = new PlayerItem("Jacket", 3, " ");

        inventory.addItem(scarf);
        inventory.addItem(baton);
        inventory.addItem(gun);
        inventory.addItem(jacket);

        inventory.printInventoryItems();
        inventory.swapItems(1, 3);
        inventory.printInventoryItems();
        inventory.swapItems(0, 2);
        inventory.printInventoryItems();
    }
}