package com.mpscexams.smartagricultureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlantItemSelect extends AppCompatActivity {

    Button btnGehu, btnToor, btnSoya;
    int phValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_item_select);
        btnGehu = findViewById(R.id.btnGehu);
        btnSoya = findViewById(R.id.btnSoya);
        btnToor = findViewById(R.id.btnToor);
        phValue = getIntent().getIntExtra("phVal", 3);


    }

    public void showInfo(View view) {
        String tag = view.getTag().toString();

        Intent i = new Intent(PlantItemSelect.this, ActualInformationActivity.class);
        i.putExtra("phVal", phValue);
        switch (tag){
            case "gehu":
                i.putExtra("plant", "gahu");
                startActivity(i);
                break;
            case "toor":
                i.putExtra("plant", "toor");
                startActivity(i);
                break;
            case "soya":
                i.putExtra("plant", "soya");
                startActivity(i);
                break;

        }
    }
}
