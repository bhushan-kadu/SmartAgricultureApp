package com.mpscexams.smartagricultureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ActualInformationActivity extends AppCompatActivity {

    WebView webView;
    int phValue;
    String plant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actual_information);

        phValue = getIntent().getIntExtra("phVal", 3);
        plant = getIntent().getStringExtra("plant");
        String result = "";
        switch (phValue){
            case 3:
                result+=plant;
                result+="three";
                break;
            case 5:
                result+=plant;
                result+="five";
                break;
            case 7:
                result+=plant;
                result+="seven";
                break;
            case 9:
                result+=plant;
                result+="nine";
                break;
            case -1:
                result="agree";
                break;
        }
        webView = findViewById(R.id.webView);

        webView.loadUrl("file:///android_asset/"+result+".html");
    }
}
