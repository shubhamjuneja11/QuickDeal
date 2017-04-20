package com.supergeek.quickdeal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity  {
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View v) {
        Log.e("abcde",v.getId()+"");
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
