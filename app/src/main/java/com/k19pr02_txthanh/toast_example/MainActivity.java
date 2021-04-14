package com.k19pr02_txthanh.toast_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // khai bao doi tuong button
        Button btn_toast = (Button) findViewById(R.id.click_toast);

        // khai bao toast
        btn_toast.setOnClickListener((View.OnClickListener) this);
       // View view;
    }

    // phuong thuc toast
    public void toast(String i){
            Toast.makeText(getApplicationContext(), "Ban vua click!"+ i ,Toast.LENGTH_LONG).show();
        }

        public void onClick(View arg0){
            // toast("1"); // tao 1 toast
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("tb", "Intent gui 1 String");  // Truyền một String
            intent.putExtra("so", 7);    // Truyền một Int

            startActivity(intent);
            // goi Activity2
            MainActivity2 t=new MainActivity2();

            this.onPause();
           // setContentView(R.layout.activity_main2);
        }






}