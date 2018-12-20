package com.polinema.aliff.tugassqllite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ritz extends AppCompatActivity {
    Button ritz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ritz);
        ritz = (Button) findViewById(R.id.btnritz);
        ritz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MapsRitz.class);
                startActivity(i);
            }
        });
    }
}
