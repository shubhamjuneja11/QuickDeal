package com.supergeek.quickdeal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.seller:
                intent=new Intent(this,SellerActivity.class);
                startActivity(intent);
                break;
            case R.id.buyer:
                intent=new Intent(this,BuyerActivity.class);
                startActivity(intent);
                break;
        }
    }
}
