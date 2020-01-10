package com.mpscexams.smartagricultureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class SeedActivity extends AppCompatActivity {

    Button button;
    Spinner s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seed);
        String[] seedsPh = new String[]{"Select Item", "ph 3-5", "ph 5-7", "ph 7-9", "ph 9-11"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, seedsPh);


        s = findViewById(R.id.spinner);
        button = findViewById(R.id.seedResultBtn);

        s.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = s.getSelectedItemPosition();

                Intent i = new Intent(SeedActivity.this, PlantItemSelect.class);
                switch (position){
                    case 0:
                    Log.v("abcde", "pos: 1");
                        break;

                    case 1:
                        Log.v("abcde", "pos: 2");
                        i.putExtra("phVal", 3);
                        startActivity(i);
                        break;
                    case 2:
                        Log.v("abcde", "pos: 3");
                        i.putExtra("phVal", 5);
                        startActivity(i);
                        break;
                    case 3:
                        Log.v("abcde", "pos: 4");
                        i.putExtra("phVal", 7);
                        startActivity(i);
                        break;
                    case 4:
                        Log.v("abcde", "pos: 5");
                        i.putExtra("phVal", 9);
                        startActivity(i);
                        break;
                }
            }
        });

    }
}
