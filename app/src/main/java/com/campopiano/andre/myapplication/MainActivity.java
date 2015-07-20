package com.campopiano.andre.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    public static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> clientNames = new ArrayList<>();
        clientNames.add("Renan");
        clientNames.add("Venilton");
        clientNames.add("Robinho");
        clientNames.add("Valdeco");
        clientNames.add("Caio");
        clientNames.add("Mario");
        clientNames.add("Andre");


        ListView listViewClients = (ListView) findViewById(R.id.listViewClients);
        ArrayAdapter<String> clientAdapter = new ArrayAdapter<String>(MainActivity.this,
                                        android.R.layout.simple_list_item_1,
                                        clientNames.toArray(new String[]{}));
        listViewClients.setAdapter(clientAdapter);

    }


}
