package com.example.uts_cecep_lelang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView auctionListView;
    private AuctionItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auctionListView = findViewById(R.id.auctionListView);

        ArrayList<AuctionItem> auctionItems = new ArrayList<>();
        // Tambahkan item lelang ke arraylist
        auctionItems.add(new AuctionItem("Iphone 11 Pro Max", "BNIB Mulus No Lecet", 8200000));
        auctionItems.add(new AuctionItem("Adidas Running Ultra Bounce", "Adidas Running Ultrabounce Unisex HQ1299", 1200000));
        auctionItems.add(new AuctionItem("Macbook Pro 17", "Macbook Pro 2017 Retina I7 Ram 16 GB SSD 256GB 13.3 inch", 9000000));

        adapter = new AuctionItemAdapter(this, auctionItems);
        auctionListView.setAdapter(adapter);
    }
}
