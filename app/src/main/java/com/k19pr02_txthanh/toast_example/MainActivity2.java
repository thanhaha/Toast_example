package com.k19pr02_txthanh.toast_example;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        // khai bao textview
        TextView txt = (TextView) findViewById(R.id.txtIntent);
        TextView so = (TextView) findViewById(R.id.txtIntent1);

        // khai bai intent
        Intent intent = getIntent();
        String value1 = intent.getStringExtra("tb");
        int n = intent.getIntExtra("so", 0);

        txt.setText(value1);
        so.setText("Intent gui 1 so:" + n);

        // back
        Button btn_back = (Button) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // goi Activity1
        MainActivity t1 = new MainActivity();
        t1.recreate();


    }
}