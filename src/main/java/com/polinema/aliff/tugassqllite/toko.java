package com.polinema.aliff.tugassqllite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class toko extends AppCompatActivity {
    CardView myTp;
    CardView myDelta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toko);
        myTp = (CardView) findViewById(R.id.card_toko);
        myTp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),tunjungan.class);
                startActivity(i);
            }
        });

        myDelta = (CardView) findViewById(R.id.card_toko2);
        myDelta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),delta.class);
                startActivity(i);
            }
        });
    }
}
