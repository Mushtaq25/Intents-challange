package com.example.intentschallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class dataActivity extends AppCompatActivity {

    EditText edtname,edtnumber,edtlocation,edtwebsite;
    ImageView happy;
    ImageView normal;
    ImageView sad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        edtname = findViewById(R.id.edtname);
        edtnumber = findViewById(R.id.edtnumber);
        edtwebsite = findViewById(R.id.edtwebsite);
        edtlocation = findViewById(R.id.edtlocation);
        happy = findViewById(R.id.happy);
        normal = findViewById(R.id.normal);
        sad = findViewById(R.id.sad);

        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(dataActivity.this,happy.class);
                String name = edtname.getText().toString().trim();
                String number = edtnumber.getText().toString().trim();
                String website = edtwebsite.getText().toString().trim();
                String location = edtlocation.getText().toString().trim();
                i.putExtra("name",name);
                i.putExtra("number",number);
                i.putExtra("website",website);
                i.putExtra("location",location);
                startActivity(i);

            }
        });

        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(dataActivity.this,Normal.class);
                String name = edtname.getText().toString().trim();
                String number = edtnumber.getText().toString().trim();
                String website = edtwebsite.getText().toString().trim();
                String location = edtlocation.getText().toString().trim();
                i.putExtra("name",name);
                i.putExtra("number",number);
                i.putExtra("website",website);
                i.putExtra("location",location);
                startActivity(i);

            }
        });

        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(dataActivity.this,Sad.class);
                String name = edtname.getText().toString().trim();
                String number = edtnumber.getText().toString().trim();
                String website = edtwebsite.getText().toString().trim();
                String location = edtlocation.getText().toString().trim();
                i.putExtra("name",name);
                i.putExtra("number",number);
                i.putExtra("website",website);
                i.putExtra("location",location);
                startActivity(i);

            }
        });
    }
}
