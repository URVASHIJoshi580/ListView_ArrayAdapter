package com.urvashi.listview_arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myListView=findViewById(R.id.myList);
        //Populate the list view
        String items[]=new String[]{"Strawberry", "Apple","Mango","Guava","Dragon Fruit"};

        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,items);
        myListView.setAdapter(myAdapter);
    }
}