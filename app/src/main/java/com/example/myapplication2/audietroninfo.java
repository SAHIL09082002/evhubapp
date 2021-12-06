package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class audietroninfo extends AppCompatActivity {


    private ImageButton add2;

    private ImageButton pro2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audietroninfo);

        pro2=findViewById(R.id.profilepage2);
        add2=findViewById(R.id.pagesave2);



        pro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {

                Intent intent4=new Intent( audietroninfo.this,profilepage.class);
                startActivity(intent4);
            }
        });

        add2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v3) {
                Toast.makeText(getApplicationContext() ,
                        "Added To Wishlist",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}