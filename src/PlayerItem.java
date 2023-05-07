public class PlayerItem {

    String nameOfItem;
    int statBuff;
    String descriptionOfItem;
    float amountItemIsWorth;

    // Default/Blank
    public PlayerItem() {
        nameOfItem = null;
        statBuff = 0;
        descriptionOfItem = null;
        amountItemIsWorth = 0.0f;
    }

    public PlayerItem(String nameOfItem, int statBuff, String descriptionOfItem, float amountItemIsWorth) {
        this.nameOfItem = nameOfItem;
        this.descriptionOfItem = descriptionOfItem;
        this.statBuff = statBuff;
        this.amountItemIsWorth = amountItemIsWorth;
    }

    //


}
