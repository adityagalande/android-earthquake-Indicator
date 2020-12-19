package com.example.earthquakeindicator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ArrayList<earthquakeData> earthquakes = new ArrayList<>();
//        earthquakes.add(new earthquakeData( "1.2","Delhi","Nov 12, 2019"));
//        earthquakes.add(new earthquakeData( "5.3","Washington DC","Jan 16, 2020"));
//        earthquakes.add(new earthquakeData( "3.7","Ludhiyana","Dec 27, 1979"));
//        earthquakes.add(new earthquakeData( "5.5","Toronto","Aug 30, 1870"));
//        earthquakes.add(new earthquakeData( "9.7","Hiroshima","Feb 17, 1767"));
//        earthquakes.add(new earthquakeData( "7.7","Hawana","Sept 03, 1763"));

        ArrayList<earthquakeData> earthquakes = QueryUtils.extractEarthquakes();

        ListView listView = (ListView) findViewById(R.id.earthquakeList);

        earthquakeAdapter earthquakeArray = new earthquakeAdapter(this, earthquakes);
        listView.setAdapter(earthquakeArray);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                earthquakeData urlData = earthquakes.get(position);

                Intent URL = new Intent(Intent.ACTION_VIEW);
                URL.setData(Uri.parse(urlData.getUrl()));
                startActivity(URL);
            }
        });
    }
}