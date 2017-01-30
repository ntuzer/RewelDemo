package com.ntuzer.reweldemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import com.ntuzer.reweldemo.adapter.ListViewAdapter;

import static com.ntuzer.reweldemo.R.*;

public class ListViewActivity extends AppCompatActivity {

    private ListView listView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        initialView();
    }
    private void initialView(){
        listView = (ListView) findViewById(R.id.list_view);
        ListViewAdapter listViewAdapter = new ListViewAdapter(this);
        listView.setAdapter(listViewAdapter);


    }
}