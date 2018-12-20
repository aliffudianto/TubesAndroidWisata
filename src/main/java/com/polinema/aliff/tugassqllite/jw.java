package com.polinema.aliff.tugassqllite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jw extends AppCompatActivity {
    Button marriot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jw);
        marriot = (Button) findViewById(R.id.btnjw);
        marriot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MapsJw.class);
                startActivity(i);
            }
        });
    }
}
