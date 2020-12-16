package com.example.earthquakeindicator;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class earthquakeAdapter extends ArrayAdapter {
    public earthquakeAdapter(@NonNull Activity context, ArrayList<earthquakeData> earthquake) {
        super(context, 0, earthquake);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        earthquakeData itemPosition = (earthquakeData) getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_listitem, parent, false);
        }

        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitudeText);
        magnitudeTextView.setText(itemPosition.getMagnitude());

        TextView cityTextView = (TextView) listItemView.findViewById(R.id.cityText);
        cityTextView.setText(itemPosition.getCity());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.dateText);
        dateTextView.setText(itemPosition.getDate());

        return listItemView;
    }
}
