package com.evilstar.stock_market;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.evilstar.stock_market.ui.EcommerceActivity;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @BindView(R.id.nextPart)
    Button mNextPart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNextPart = (Button) findViewById(R.id.nextPart);

        mNextPart.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
if(v == mNextPart){
    Intent intent =new Intent(MainActivity.this, EcommerceActivity.class);
    startActivity(intent);
    finish();
}
    }
}
