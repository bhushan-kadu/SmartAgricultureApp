package com.mpscexams.smartagricultureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openMoreOptions(View view) {
        String tag = view.getTag().toString();
        Intent i = new Intent(MainActivity.this, SeedActivity.class);


        switch (tag){
            case "iot":
//                startActivity(i);
                break;
            case "seeds":
                startActivity(i);
                break;
            case "ferti":
//                startActivity(i);
                break;
            case "market":
                i = new Intent(MainActivity.this, ActualInformationActivity.class);
                i.putExtra("phVal", -1);
                startActivity(i);
                break;

        }
    }
}
