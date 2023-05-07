import java.util.ArrayList;
import java.util.List;

public class PlayerInventory {

        private List<PlayerItem> playerInventory = new ArrayList<>();

        public PlayerInventory() {

        }


        /**
         * Simple function to add the item into the inventory.
         *
         * @param item the item that is to be added to the inventory.
         */
        void addItem(PlayerItem item) {
            playerInventory.add(item);
        }


        /**
         * Getter for number of items in the inventory.
         *
         * @return the number of items in the players inventory.
         */
        int getNumberOfItems() {
                return playerInventory.size();
        }


        /**
         * Function to print out the items of the inventory.
         */
        void printInventoryItems() {
                for (PlayerItem item : playerInventory) {
                        String itemName = item.nameOfItem;
                        System.out.println(itemName + " ");
                }
                System.out.println();
        }


        /**
         *  Swap function for two specified index's.
         *
         * @param index1 The first index that is to be swapped.
         * @param index2 The Second index that is to be swapped.
         */
        void swapItems(int index1, int index2) {
                PlayerItem temp = playerInventory.get(index1);
                playerInventory.set(index1, playerInventory.get(index2));
                playerInventory.set(index2, temp);
        }

        /**
         *  Removes item of a specified index from the inventory.
         *
         * @param indexOfItem The index of the item to be removed.
         */
        void removeItem(int indexOfItem) {
                playerInventory.remove(indexOfItem);
        }

}
