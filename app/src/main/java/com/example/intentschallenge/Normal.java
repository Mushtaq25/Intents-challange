package com.example.intentschallenge;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Normal extends AppCompatActivity {

    ImageView ivphone,ivwebsite,ivlocation;
    TextView tvname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        ivphone = findViewById(R.id.ivphone);
        ivwebsite = findViewById(R.id.ivwebsite);
        ivlocation = findViewById(R.id.ivlocation);
        tvname = findViewById(R.id.tvname);

        final String phone = getIntent().getStringExtra("number");
        final String website = getIntent().getStringExtra("website");
        final String location = getIntent().getStringExtra("location");
        final String nm = getIntent().getStringExtra("name");


        tvname.setText(nm +" "+ "Welcome to activity" );

        ivphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phone));
                startActivity(i);

            }
        });

        ivwebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://"+ website));
                startActivity(i);

            }
        });

        ivlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q=" + location));
                startActivity(i);

            }
        });
    }
}
