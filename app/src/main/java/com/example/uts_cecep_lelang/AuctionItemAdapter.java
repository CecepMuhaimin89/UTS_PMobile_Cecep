package com.example.uts_cecep_lelang;

import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import java.util.ArrayList;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AuctionItemAdapter extends ArrayAdapter<AuctionItem> {

    public AuctionItemAdapter(Context context, ArrayList<AuctionItem> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        AuctionItem item = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView itemNameTextView = convertView.findViewById(R.id.itemNameTextView);
        TextView itemDescriptionTextView = convertView.findViewById(R.id.itemDescriptionTextView);
        TextView currentBidTextView = convertView.findViewById(R.id.currentBidTextView);

        itemNameTextView.setText(item.getItemName());
        itemDescriptionTextView.setText(item.getItemDescription());
        currentBidTextView.setText(String.valueOf(item.getCurrentBid()));

        return convertView;
    }
}
