package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class carinfo extends AppCompatActivity {

    private ImageButton add1;
    private ImageButton pro1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carinfo);

        pro1=findViewById(R.id.profilepage1);

        pro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view5) {

                Intent intent5=new Intent( carinfo.this,profilepage.class);
                startActivity(intent5);
            }
        });
        add1=findViewById(R.id.pagesave1);
        add1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v2) {
                Toast.makeText(getApplicationContext() ,
                        "Added To Wishlist:)",
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}