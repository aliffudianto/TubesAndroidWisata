package com.polinema.aliff.tugassqllite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.HashMap;


public class MainActivity extends AppCompatActivity {
    CarouselView carouselView;
    int[] sampleImages = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4, R.drawable.image_5};
    // Session Manager Class
    SessionManagement session;
    private ImageButton myWisata;
    private ImageButton myHotel;
    private ImageButton myStore;
    // Button Logout
    Button btnLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myHotel = (ImageButton) findViewById(R.id.btnhotel);
        myHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),hotel.class);
                startActivity(i);
            }
        });
        myWisata = (ImageButton) findViewById(R.id.btnwisata);
        myWisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),wisata.class);
                startActivity(i);
            }
        });
        myStore = (ImageButton) findViewById(R.id.btnstore);
        myStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),toko.class);
                startActivity(i);
            }
        });
        // Session class instance
        session = new SessionManagement(getApplicationContext());
        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
            // Button logout
            btnLogout = (Button) findViewById(R.id.btnlogout);

            Toast.makeText(getApplicationContext(), "User Login Status: " + session.isLoggedIn(), Toast.LENGTH_LONG).show();


            /**
             * Call this function whenever you want to check user login
             * This will redirect user to LoginActivity is he is not
             * logged in
             * */
            session.checkLogin();

            // get user data from session
            HashMap<String, String> user = session.getUserDetails();

            // name
            String name = user.get(SessionManagement.KEY_NAME);

            // email
            String email = user.get(SessionManagement.KEY_EMAIL);


            /**
             * Logout button click event
             * */
            btnLogout.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    // Clear the session data
                    // This will clear all session data and
                    // redirect user to LoginActivity
                    session.logoutUser();
                }
            });
        }

    };

}

