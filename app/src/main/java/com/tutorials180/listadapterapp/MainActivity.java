package com.tutorials180.listadapterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView objectListView;
    private String [] myData={"Monday-1","Tuesday-2","Wednesday-3","Thursday-4"
    ,"Friday-5","Saturday-6","Sunday-7",
            "Monday","Tuesday","Wednesday","Thursday"
            ,"Friday","Saturday","Sunday"
    ,"Monday","Tuesday","Wednesday","Thursday"
            ,"Friday","Saturday","Sunday"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeVariables();
        creatingAdapter();
    }

    private void creatingAdapter()
    {
        ArrayAdapter<String> objectArrayAdapter=new ArrayAdapter(
                this,android.R.layout.simple_list_item_1,myData
        );

        objectListView.setAdapter(objectArrayAdapter);
        objectListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int listPosition, long l) {

                
                Toast.makeText(MainActivity.this,Integer.toString(listPosition)
                        +" item clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initializeVariables()
    {
        objectListView=findViewById(R.id.listView);
    }
}
