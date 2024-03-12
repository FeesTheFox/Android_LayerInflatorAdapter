package com.example.layerinflatoradapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] names = {"Ivan", "Marie", "Tom", "Bob", "Nina", "Thomas",
                        "George", "Vincent", "Sarah", "Nikolay", "James"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finding the list
        ListView lvMain = (ListView) findViewById(R.id.lvMain);

        //creating adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.my_list_item, names);

        //assigning adapter for list
        lvMain.setAdapter(adapter);
    }
}