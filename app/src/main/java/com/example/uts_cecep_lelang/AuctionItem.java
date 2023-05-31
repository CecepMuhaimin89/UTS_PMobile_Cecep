package com.example.uts_cecep_lelang;

public class AuctionItem {
    private String itemName;
    private String itemDescription;
    private double currentBid;

    public AuctionItem(String itemName, String itemDescription, double currentBid) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.currentBid = currentBid;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public double getCurrentBid() {
        return currentBid;
    }
}

