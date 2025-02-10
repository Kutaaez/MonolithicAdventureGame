package Items;

import player.Player;
import score.ScoreManager;

import java.util.List;

public class ItemManager {
    private List<Item> items ;
    private Player player;
    private ScoreManager score;


    public ItemManager(List<Item> items, Player player, ScoreManager score) {
        this.items = items;
        this.player = player;
        this.score = score;
    }

    public void pickUpItem(Item item) {
        if(!items.contains(item)){
            System.out.println("Error" + item.getItemName()+ " we don't have this item in items..");

        }
        else {
            System.out.println(player.getPlayerName() + " picked up " + item.getItemName() + "!");
            item.itemEffect();
            player.setPlayerHealth(player.getPlayerHealth() + item.getItemHP());

            player.addPlayerExperience(item.getItemEXP());

            System.out.println("After lifting the item: Health = " + player.getPlayerHealth() + ", Experience = " + player.getPlayerExperience());
            player.addItemToInventory(item);
            score.addScore(1);
            items.remove(item);
            System.out.println("Inventory now: " + player.getInventory());
        }
    }
}
