package com.example.gdnbj.thustimer;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Beom-Jun on 2017-01-07.
 */

public class ListView extends ListActivity {
    ArrayList<String> listItems = new ArrayList<String>();
    ArrayAdapter<String> adapter;

    @Override
    public void onCreate(Bundle statistics) {
        super.onCreate(statistics);
        setContentView(R.layout.activity_statistics_select);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked, listItems);
        setListAdapter(adapter);
    }

    public void addItems() {
        listItems.add("Time Record");
        adapter.notifyDataSetChanged();
    }
}
