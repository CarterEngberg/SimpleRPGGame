import java.util.ArrayList;
import java.util.List;

public class PlayerInventory {

        private List<PlayerItem> playerInventory = new ArrayList<>();
        float dollarieDoos;

        public PlayerInventory() {
                dollarieDoos = 0.0f;
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
                        int statBuff = item.statBuff;
                        float amount = item.amountItemIsWorth;
                        System.out.println(itemName + " " + statBuff + " " + amount);
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

        /**
         *  Sets the amount of money the player has to their
         *  current amount + amount of item they are replacing.
         *
         * @param dollarieDoos The amount of money the item you are selling is worth
         */
        void setTotalAmountOfMoney(float dollarieDoos) {
                this.dollarieDoos += dollarieDoos;
        }


        /**
         *  Gets the amount of the item at the given index.
         *
         * @param index The index of the item the player needs to find out how much it is worth
         * @return The amount the item is worth
         */
        float getAmountItemIsWorth(int index) { return playerInventory.get(index).amountItemIsWorth ; }

        /**
         * Prints out the amount of money the player has
         */
        void printDollarieDoosAmount() {
                System.out.println("You have " + dollarieDoos);
                System.out.println();
        }

        float getAmountOfMoney() {
                return dollarieDoos;
        }

        /**
         *  Sell any item in your inventory and give the player the according value
         *
         * @param index The index of the item you are wanting to sell
         */
        void sellItem(int index) {
                setTotalAmountOfMoney(getAmountItemIsWorth(index));
                playerInventory.remove(index);
        }

}
