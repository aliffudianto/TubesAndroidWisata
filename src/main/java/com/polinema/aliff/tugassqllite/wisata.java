package com.polinema.aliff.tugassqllite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class wisata extends AppCompatActivity {
    private CardView myDisney;
    private CardView myUniversal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        myDisney =(CardView) findViewById(R.id.card_wisata);
        myDisney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),disney.class);
                startActivity(i);
            }
        });
        myUniversal =(CardView) findViewById(R.id.card_wisata2);
        myUniversal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),universal.class);
                startActivity(i);
            }
        });
    }
}
