package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.myapplication2.Connection.consql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class registrationpage extends AppCompatActivity {


    private ImageButton sign;
    EditText name, pass;
    Connection con;
    Statement stmt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrationpage);

        sign = findViewById(R.id.signup);
        name = findViewById(R.id.username1);
        pass = findViewById(R.id.password1);

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view9) {

                Intent intent9 = new Intent(registrationpage.this, MainActivity.class);
                startActivity(intent9);
            }
        });
      /*  sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view92) {

                new registrationpage.registeruser().execute("");
            }
        });*/


    }

    public class registeruser extends AsyncTask<String, String, String> {

        String z = "";
        Boolean isSuccess = false;


        @Override
        protected void onPostExecute(String s) {
            name.setText("");
            pass.setText("");
        }

        @Override
        protected String doInBackground(String... strings) {
            try {
                con = connectionClass(consql.un.toString(), consql.pass.toString(), consql.db.toString(), consql.ip.toString());
                if (con == null) {
                    z = "Check your Internet Connection";
                } else {
                    String sql = "INSERT INTO register (name,password) VALUES('" + name.getText() + "," + pass.getText() + ")";
                    stmt = con.createStatement();
                    stmt.executeUpdate(sql);

                }

            } catch (Exception e) {
                isSuccess = false;
                z = e.getMessage();

            }


            return z;
        }
    }

    @SuppressLint("NEWAPI")
    public Connection connectionClass(String user, String password, String database, String server) {

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection connection = null;
        String connectionurl = null;

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            connectionurl = "jdbc:jtds:sqlserver://" + server + "/" + database + "user=" + user + "password=" + password + ";";
            connection = DriverManager.getConnection(connectionurl);

        } catch (Exception e) {
            Log.e("SQL Connection Error:", e.getMessage());


        }
        return connection;
    }
}



