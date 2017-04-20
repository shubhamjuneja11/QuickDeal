package com.supergeek.quickdeal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock);
        int i=getIntent().getIntExtra("open",1);
        switch (i){
            case 1:
                setContentView(R.layout.mock1);
                setTitle("Home");
                break;
            case 2:
                setContentView(R.layout.mock2);
                setTitle("Conversations");
                break;
            case 3:
                setContentView(R.layout.mock3);
                setTitle("Profile");
                break;
            case 5:
                setContentView(R.layout.mock5);
                setTitle("Support");
                break;
            case 7:
                setContentView(R.layout.mock7);
                setTitle("Posted Requirements");
                break;
        }
    }
}
