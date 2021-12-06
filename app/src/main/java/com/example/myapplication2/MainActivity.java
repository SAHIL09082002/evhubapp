package com.example.myapplication2;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
   import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageButton refresh1;


    private ImageButton pro;
    private ImageButton nexon;
    private ImageButton audiev;
    private ImageButton signupp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         refresh1 =findViewById(R.id.refresh);
         pro=findViewById(R.id.profilepage);


         nexon=findViewById(R.id.nexonevinfo);
         audiev=findViewById(R.id.audiinfo);


        refresh1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v1) {
                Toast.makeText(getApplicationContext() ,
                        "Page Refreshed",
                        Toast.LENGTH_LONG).show();
            }
        });





        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {

                Intent intent=new Intent( MainActivity.this,profilepage.class);
                startActivity(intent);
            }
        });
        nexon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {

                Intent intent2=new Intent( MainActivity.this,carinfo.class);
                startActivity(intent2);
            }
        });
        audiev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {

                Intent intent3=new Intent( MainActivity.this,audietroninfo.class);
                startActivity(intent3);
            }
        });





    }
}