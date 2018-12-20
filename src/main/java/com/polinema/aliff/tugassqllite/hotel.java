package com.polinema.aliff.tugassqllite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class hotel extends AppCompatActivity {
    private CardView myJw;
    private CardView myRitz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        myJw = (CardView) findViewById(R.id.card_hotel);
        myJw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),jw.class);
                startActivity(i);
            }
        });
        myRitz = (CardView) findViewById(R.id.card_hotel2);
        myRitz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ritz.class);
                startActivity(i);
            }
        });

    }
}
