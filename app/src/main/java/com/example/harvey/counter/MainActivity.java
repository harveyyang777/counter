package com.example.harvey.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener {

    TextView txv;
    Button btn;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txv = (TextView) findViewById(R.id.txv);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
        btn.setOnLongClickListener(this);
        txv.setOnLongClickListener(this);
        txv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        // txv.setText("click");
        if(v.getId()==R.id.button){
            txv.setText(String.valueOf(++count));
        }else{
            txv.setText(String.valueOf(--count));
        }

    }

    @Override
    public boolean onLongClick(View v) {

        if (v.getId() == R.id.button) {
            count=count+10;
            txv.setText(String.valueOf(count));
            return false;
        } else if (v.getId() == R.id.txv) {
            count = 0;
            txv.setText(String.valueOf(count));
            return  true;
        }
        return true;
    }
}