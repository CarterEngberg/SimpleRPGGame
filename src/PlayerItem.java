public class PlayerItem {

    String nameOfItem;
    int statBuff;
    String descriptionOfItem;

    // Default/Blank
    public PlayerItem() {
        nameOfItem = null;
        statBuff = 0;
        descriptionOfItem = null;
    }

    public PlayerItem(String nameOfItem, int statBuff, String descriptionOfItem) {
        this.nameOfItem = nameOfItem;
        this.descriptionOfItem = descriptionOfItem;
        this.statBuff = statBuff;
    }

    //


}
